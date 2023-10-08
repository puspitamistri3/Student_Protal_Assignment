package com.studentPortal.Repo;

import com.studentPortal.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, String> {

}
