package com.ironhack.musicplatform.controller;

import com.ironhack.musicplatform.dto.AddSongToPlaylistRequest;
import com.ironhack.musicplatform.model.Playlist;
import com.ironhack.musicplatform.service.PlaylistService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playlists")
@RequiredArgsConstructor
public class PlaylistController {

    private final PlaylistService playlistService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Playlist create(@RequestBody Playlist playlist) {
        return playlistService.create(playlist);
    }


    @PatchMapping("{playlistId}/songs")
    public Playlist addSong(@PathVariable Integer playlistId, @RequestBody AddSongToPlaylistRequest request) {
        return playlistService.addSong(playlistId, request);
    }

    @GetMapping
    public List<Playlist> getAll() {
        return playlistService.getAll();
    }

}
