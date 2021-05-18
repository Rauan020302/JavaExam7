package itacademy.task2.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "role")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role_name",nullable = false)
    private String roleName;

    @ManyToOne
    @JoinColumn(name = "student_id",nullable = false)
    private Student student;
}
