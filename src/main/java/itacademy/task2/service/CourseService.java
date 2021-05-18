package itacademy.task2.service;

import itacademy.task2.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourse();
    Course save(Course course);
    Course getCourseById(Long id);
    Course deleteCourseById(Long id);
    Course updateCourse(Long id,Course course);
}
