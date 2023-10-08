package com.studentPortal.Service;

import com.studentPortal.Model.Laptop;
import com.studentPortal.Model.Student;
import com.studentPortal.Repo.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
     @Autowired
    LaptopRepo laptopRepo;

    public String addLaptop(List<Laptop> newLaptop) {
        laptopRepo.saveAll(newLaptop);
        return  "New Laptop Added Successfully!!";
    }

    public List<Laptop> getAll() {
        return  laptopRepo.findAll();
    }

    public String deleteById(String laptopId) {
        laptopRepo.deleteById(laptopId);
        return  "Laptop Deleted Successfully!!";
    }

    public String updateStudentName(String laptopId, String newName) {
        Laptop name = laptopRepo.findById(laptopId).orElse(null);
        if (name != null) {
            name.setName((newName));
            laptopRepo.save(name);
        }
        return "Student name updated successfully!";
    }

}
