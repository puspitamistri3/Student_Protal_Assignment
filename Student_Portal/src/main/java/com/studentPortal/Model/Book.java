package com.studentPortal.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {

    @Id
    private String ID;
    private String title;
    private String author;
    private String description;
    private Double price;

    @ManyToOne
    @JoinColumn(name = " fk_student_Id")
    private Student student;


}
