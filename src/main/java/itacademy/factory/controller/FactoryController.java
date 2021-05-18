package itacademy.factory.controller;

import itacademy.factory.entity.Cinema;
import itacademy.factory.entity.Restaurant;
import itacademy.factory.entity.Ticket;
import itacademy.factory.enums.Type;
import itacademy.factory.service.CinemaService;
import itacademy.factory.service.RestaurantService;
import itacademy.factory.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/book")
public class FactoryController {
    @Autowired
    private CinemaService cinemaService;
    @Autowired
    private RestaurantService restaurantService;
    @Autowired
    private TicketService ticketService;

    @PostMapping("/{code}")
    public Type save(@PathVariable Long code){
        if (code == 1L){
            Cinema cinema = new Cinema(1L,"Cinema",10000,"New York","Cinema.com", LocalDate.now());
            cinemaService.save(cinema);
            return Type.CINEMA;
        }else if (code == 2L){
            Restaurant restaurant = new Restaurant(1L,"Restaurant","London","cheese","Rest.com",LocalDate.now());
            restaurantService.save(restaurant);
            return Type.RESTAURANT;
        }else if (code == 3L){
            Ticket ticket = new Ticket(1L,"ticket","ticket.com","card",LocalDate.now());
            ticketService.save(ticket);
            return Type.TICKET;
        }else {
            return null;
        }
    }
}
