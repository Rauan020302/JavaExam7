package itacademy.task2.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "student")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "status")
    private Long status;


    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @Column(name = "date")
    private LocalDate date = LocalDate.now();

    @Column(name = "contract")
    private BigDecimal contract;



}
