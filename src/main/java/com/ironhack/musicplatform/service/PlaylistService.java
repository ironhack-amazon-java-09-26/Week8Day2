package com.ironhack.musicplatform.service;

import com.ironhack.musicplatform.dto.AddSongToPlaylistRequest;
import com.ironhack.musicplatform.model.Playlist;
import com.ironhack.musicplatform.model.Song;
import com.ironhack.musicplatform.repository.PlaylistRepository;
import com.ironhack.musicplatform.repository.SongRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlaylistService {

    private final PlaylistRepository playlistRepository;
    private final SongRepository songRepository;

    public Playlist create(Playlist playlist) {
        return playlistRepository.save(playlist);
    }

    public Playlist addSong(Integer playlistId, AddSongToPlaylistRequest request) {
        Playlist playlist = playlistRepository.findById(playlistId).orElseThrow();

        Song songsToAdd = songRepository.findById(request.getSongId()).orElseThrow();

        playlist.addSong(songsToAdd);
        return playlistRepository.save(playlist);
    }


    public List<Playlist> getAll() {
        return playlistRepository.findAll();
    }
}
