package com.ironhack.hellocrud.model;

import jakarta.persistence.Entity;

@Entity
public class DreamMonster extends Monster {

    private String dreamPhase;
    private String dreamSign;
}
