package com.studentPortal.Controller;

import com.studentPortal.Model.Student;
import com.studentPortal.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public  String addStudent(@RequestBody List<Student> newStudent){
        return studentService.addStudent(newStudent);
    }

    @GetMapping("students")
    public  List<Student> getAll(){
        return studentService.getAll();
    }
    @DeleteMapping("deleteStudent")
    public  String deleteById(@RequestParam String studentId){
        return  studentService.deleteById(studentId);
    }
    @PutMapping("studentName/{studentId}")
    public String updateStudentName(@PathVariable String studentId, @RequestParam String name)
    {
        return studentService.updateStudentName(studentId, name);
    }
}
