package itacademy.task2.service;

import itacademy.task2.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();
    Student save(Student student);
    Student getStudentById(Long id);
    Student deleteStudentById(Long id);
    Student updateStudent(Long id,Student student);
    Student findByFullName(String name);
}
