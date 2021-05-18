package itacademy.task2.controller;

import itacademy.task2.entity.Student;
import itacademy.task2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }
    @GetMapping
    public List<Student> getAllStudent(@RequestBody Student student){
        return studentService.getAllStudent();
    }
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }
    @DeleteMapping("/{id}")
    public Student deleteStudentById(@PathVariable Long id){
        return studentService.deleteStudentById(id);
    }
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id,@RequestBody Student student){
        return studentService.updateStudent(id,student);
    }
}
