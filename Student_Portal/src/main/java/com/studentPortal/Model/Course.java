package com.studentPortal.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
    @Id
    private String ID;
    private String title;
    private String description;
    private String duration;

    @ManyToMany
     @JoinColumn(name = "fk_student_id")
    Set<Student> studentSet;
}
