package itacademy.factory.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ticket")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class Ticket implements Extend{
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "site")
    private String site;

    @Column(name = "payment")
    private String payment;

    @Column(name = "date")
    private LocalDate date = LocalDate.now();

    @Override
    public void foo() {
        System.out.println("Ticket");
    }
}
