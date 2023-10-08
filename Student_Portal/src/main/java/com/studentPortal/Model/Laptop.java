package com.studentPortal.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Laptop {
    @Id
    private String ID;
    private String name;
    private String brand;
    private Integer price;

    @OneToOne
    @JoinColumn(name = "fk_student_id")
    private Student student;
}
