package com.studentPortal.Controller;

import com.studentPortal.Model.Address;
import com.studentPortal.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String postAddress(@RequestBody List<Address> pAddress){
        return  addressService.postAddress(pAddress);
    }
    @GetMapping("address/address")
    public List<Address> getAddress(){
        return addressService.getAddress();
    }

    @DeleteMapping("deleteAddress/{id}")
    public  String deleteAddress(@PathVariable  Long id){
        return addressService.deleteAddress(id);
    }

    @PutMapping("update/address/id/{id}")
    public String updateAddress(@PathVariable Long id, @RequestParam String myLandmark) {
        return addressService.updateAddress(id, myLandmark);
    }

}
