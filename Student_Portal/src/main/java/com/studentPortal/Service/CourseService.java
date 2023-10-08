package com.studentPortal.Service;

import com.studentPortal.Model.Course;
import com.studentPortal.Model.Laptop;
import com.studentPortal.Repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;

    public List<Course> getAll() {
        return  courseRepo.findAll();
    }

    public String addCourses(List<Course> newCourse) {
        courseRepo.saveAll(newCourse);
        return  "New Courses Added Successfully!!";
    }

    public String deleteById(String courseId) {
        courseRepo.deleteById(courseId);
        return  "Course Deleted Successfully!";
    }

    public String updateCourseName(String courseId, String newName) {
        Course course = courseRepo.findById(courseId).orElse(null);
        if (course != null) {
            course.setTitle((newName));
            courseRepo.save(course);
        }
        return  "Course Deleted Successfully!";
    }
}