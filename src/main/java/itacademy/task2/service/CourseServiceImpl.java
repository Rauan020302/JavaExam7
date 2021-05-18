package itacademy.task2.service;

import itacademy.task2.entity.Course;
import itacademy.task2.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;
    @Override
    public List<Course> getAllCourse() {
        return courseRepository.findAll();
    }
    @Override
    public Course save(Course course) {
        return courseRepository.save(course);
    }
    @Override
    public Course getCourseById(Long id) {
        return courseRepository.findById(id).orElse(null);
    }
    @Override
    public Course deleteCourseById(Long id) {
        Course course = getCourseById(id);
        if (course != null){
            courseRepository.delete(course);
            return course;
        }
        return null;
    }
    @Override
    public Course updateCourse(Long id, Course course) {
        Course course1 = getCourseById(id);
        course1.setName(course.getName());
        return save(course1);
    }
}
