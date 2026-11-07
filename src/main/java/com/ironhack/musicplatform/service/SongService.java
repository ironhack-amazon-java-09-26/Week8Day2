package com.ironhack.musicplatform.service;

import com.ironhack.musicplatform.model.Song;
import com.ironhack.musicplatform.repository.SongRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SongService {

    private final SongRepository songRepository;

    public Song create(Song song) {
        return songRepository.save(song);
    }
}
