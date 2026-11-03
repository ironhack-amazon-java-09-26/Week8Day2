package com.ironhack.hellocrud.model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "countryPrefix", column = @Column(name = "home_country_prefix")),
            @AttributeOverride(name = "phoneNumber", column = @Column(name = "home_phone_number"))
    })
    private PhoneNumber homePhoneNumber;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "countryPrefix", column = @Column(name = "mobile_country_prefix")),
            @AttributeOverride(name = "phoneNumber", column = @Column(name = "mobile_phone_number"))
    })
    private PhoneNumber mobilePhoneNumber;
}
