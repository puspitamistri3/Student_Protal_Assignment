package com.studentPortal.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {

    @Id
    private Long addressId;
    private String landmark;
    private Integer zipcode;
    private String district;
    private String state;
    private String country;

}
