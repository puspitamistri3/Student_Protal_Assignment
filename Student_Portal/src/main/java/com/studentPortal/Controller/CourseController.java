package com.studentPortal.Controller;

import com.studentPortal.Model.Course;
import com.studentPortal.Model.Laptop;
import com.studentPortal.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping("newCourses")
    public  String addCourses(@RequestBody List<Course> newCourse){
        return courseService.addCourses(newCourse);
    }


    @GetMapping("courses")
    public  List<Course> getAll(){
        return courseService.getAll();
    }

    @DeleteMapping("course")
    public  String deleteById(@RequestParam String courseId){
        return  courseService.deleteById(courseId);
    }

    @PutMapping("courseName/{courseId}")
    public String updateCourseName(@PathVariable String courseId, @RequestParam String name)
    {
        return courseService.updateCourseName(courseId, name);
    }

}
