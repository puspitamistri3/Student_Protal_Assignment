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
public class Student {

    @Id
    private String id;
    private String name;
    private String age;
    private Long phoneNumber;
    private String branch;
    private String department;

    @OneToOne
    @JoinColumn(name = "fk_address_id")
    private Address address;

    @OneToMany(mappedBy = "studentSet", cascade = CascadeType.ALL)
    Set<Course> courseSet;
}
