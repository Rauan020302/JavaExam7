package itacademy.task2.controller;

import itacademy.task2.entity.Course;
import itacademy.task2.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @PostMapping
    public Course save(@RequestBody Course course){
        return courseService.save(course);
    }
    @GetMapping
    public List<Course> getAllCourse(@RequestBody Course course){
        return courseService.getAllCourse();
    }
    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable Long id){
        return courseService.getCourseById(id);
    }
    @DeleteMapping("/{id}")
    public Course deleteCourse(@PathVariable Long id){
        return courseService.deleteCourseById(id);
    }
    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable Long id,@RequestBody Course course){
        return courseService.updateCourse(id,course);
    }
}
