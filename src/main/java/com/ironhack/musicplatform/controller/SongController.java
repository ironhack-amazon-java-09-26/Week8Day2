package com.ironhack.musicplatform.controller;

import com.ironhack.musicplatform.model.Song;
import com.ironhack.musicplatform.service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/songs")
@RequiredArgsConstructor
public class SongController {

    private final SongService songService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Song create (@RequestBody Song song){
        return songService.create(song);
    }
}
