package com.ironhack.hellocrud.controller;

import com.ironhack.hellocrud.model.Dinosaur;
import com.ironhack.hellocrud.service.DinosaurService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dinosaurs")
@RequiredArgsConstructor
public class DinosaurController {

    private final DinosaurService dinosaurService;


    @GetMapping
    public List<Dinosaur> findAll(){
        return dinosaurService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Dinosaur create(@RequestBody Dinosaur dinosaur){
        return dinosaurService.create(dinosaur);
    }
}
