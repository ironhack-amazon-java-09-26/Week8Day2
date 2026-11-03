package com.ironhack.hellocrud.service;

import com.ironhack.hellocrud.model.Dinosaur;
import com.ironhack.hellocrud.repository.DinosaurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DinosaurService {

    private final DinosaurRepository dinosaurRepository;

    public Dinosaur create(Dinosaur dinosaur) {
        return dinosaurRepository.save(dinosaur);
    }

    public List<Dinosaur> findAll(){
        return dinosaurRepository.findAll();
    }
}
