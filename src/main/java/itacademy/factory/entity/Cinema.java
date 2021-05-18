package itacademy.factory.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "cinema")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class Cinema implements Extend{
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;

    @Column(name = "size")
    private Integer size;

    @Column(name = "address")
    private String address;

    @Column(name = "site")
    private String site;

    @Column(name = "date")
    private LocalDate date = LocalDate.now();

    @Override
    public void foo() {
        System.out.println("Cinema");
    }
}
