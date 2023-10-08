package com.studentPortal.Repo;

import com.studentPortal.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address , Long> {
}
