package com.ironhack.hellocrud.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;

    @Embedded
    private PhoneNumber phoneNumber;

}
