package com.ironhack.musicplatform.controller;

import com.ironhack.musicplatform.model.Album;
import com.ironhack.musicplatform.model.Artist;
import com.ironhack.musicplatform.service.ArtistService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artists")
@RequiredArgsConstructor
public class ArtistController {


    private final ArtistService artistService;

    @GetMapping
    public List<Artist> getAll() {
        return artistService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Artist create(@RequestBody Artist artist) {
        return artistService.create(artist);
    }

    @PostMapping("/{id}/albums")
    @ResponseStatus(HttpStatus.CREATED)
    public Album addAlbum(@RequestBody Album album , @PathVariable Integer id){
        return artistService.addAlbum(album, id);
    }
}
