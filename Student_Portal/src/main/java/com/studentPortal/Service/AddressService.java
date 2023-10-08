package com.studentPortal.Service;

import com.studentPortal.Model.Address;
import com.studentPortal.Repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressRepo addressRepo;

    public String postAddress(List<Address> pAddress) {
        addressRepo.saveAll(pAddress);
        return "Address Updated Successfully!";
    }

    public List<Address> getAddress() {
        return addressRepo.findAll();
    }

    public String deleteAddress(Long id) {
        addressRepo.deleteById(id);
        return "Address Deleted Successfully!";
    }
    public String updateAddress(Long id, String myLandmark) {
        Address address = addressRepo.findById(id).orElse(null);
        if (address != null) {
            address.setLandmark(myLandmark);
            addressRepo.save(address);
        }
        return "Landmark Updated Successfully!";
    }
}
