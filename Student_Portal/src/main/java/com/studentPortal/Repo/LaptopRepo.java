package com.studentPortal.Repo;

import com.studentPortal.Model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepo extends JpaRepository<Laptop, String> {
}
