package com.ironhack.hellocrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Dinosaur extends Monster {

    private String prehistoricPeriod;
    private String color;

}
