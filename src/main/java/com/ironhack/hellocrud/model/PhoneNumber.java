package com.ironhack.hellocrud.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class PhoneNumber {
    private String countryPrefix;
    private String phoneNumber;
}
