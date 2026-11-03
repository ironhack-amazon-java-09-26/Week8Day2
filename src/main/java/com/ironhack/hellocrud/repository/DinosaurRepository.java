package com.ironhack.hellocrud.repository;

import com.ironhack.hellocrud.model.Dinosaur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DinosaurRepository extends JpaRepository<Dinosaur, Integer> {
}
