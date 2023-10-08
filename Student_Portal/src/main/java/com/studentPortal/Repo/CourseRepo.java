package com.studentPortal.Repo;

import com.studentPortal.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo  extends JpaRepository<Course,String> {
}
