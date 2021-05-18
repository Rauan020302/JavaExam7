package itacademy.factory.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "base")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class Base {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
