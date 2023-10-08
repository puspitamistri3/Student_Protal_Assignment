package com.studentPortal.Service;

import com.studentPortal.Model.Student;
import com.studentPortal.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public String addStudent(List<Student> newStudent) {
        studentRepo.saveAll(newStudent);
        return " New Student Added Successfully !!";
    }


    public List<Student> getAll() {
        return studentRepo.findAll();
    }

    public String deleteById(String studentId) {
        studentRepo.deleteById(studentId);
        return "Student deleted successfully !!";
    }

    public String updateStudentName(String studentId, String name) {
        Student student = studentRepo.findById(studentId).orElse(null);
        if (student != null) {
            student.setName((name));
            studentRepo.save(student);
        }
        return "Student name updated successfully!";
    }
}
