package itacademy.factory.service;

import itacademy.factory.entity.Cinema;
import itacademy.factory.repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CinemaServiceImpl implements CinemaService {
    @Autowired
    private CinemaRepository cinemaRepository;


    @Override
    public Cinema save(Cinema cinema) {
        return cinemaRepository.save(cinema);
    }
}
