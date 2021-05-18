package itacademy.factory.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "restaurant")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class Restaurant implements Extend{
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "food")
    private String food;
    @Column(name = "site")
    private String site;
    @Column(name = "date")
    private LocalDate date = LocalDate.now();

    @Override
    public void foo() {
        System.out.println("Restaurant");
    }
}
