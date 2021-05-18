package itacademy.task2.service;

import itacademy.task2.entity.Student;
import itacademy.task2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }
    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }
    @Override
    public Student deleteStudentById(Long id){
        Student student = getStudentById(id);
        if (student != null){
            studentRepository.delete(student);
            return student;
        }
        return null;
    }
    @Override
    public Student updateStudent(Long id, Student student) {
        Student student1 = getStudentById(id);
        student1.setFullName(student.getFullName());
        student1.setCourse(student.getCourse());
        student1.setStatus(student.getStatus());
        student1.setContract(student.getContract());
        student1.setDate(student.getDate());
        return save(student1);
    }

    @Override
    public Student findByFullName(String name) {
        return studentRepository.findByFullName(name).orElse(null);
    }
}
