package com.ironhack.musicplatform.service;

import com.ironhack.musicplatform.model.Album;
import com.ironhack.musicplatform.model.Artist;
import com.ironhack.musicplatform.repository.AlbumRepository;
import com.ironhack.musicplatform.repository.ArtistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArtistService {

    private final ArtistRepository artistRepository;
    private final AlbumRepository albumRepository;

    public List<Artist> getAll() {
        return artistRepository.findAll();
    }

    public Artist create(Artist artist) {
        return artistRepository.save(artist);
    }

    public Album addAlbum(Album album, Integer artistId) {
        Artist artistFromDb = artistRepository.findById(artistId).orElseThrow();
        album.setArtist(artistFromDb);
        Album albumSaved = albumRepository.save(album);
        System.out.println("\u001B[34m Album saved: " + albumSaved + "\u001B[33m Holé");
        return albumSaved;
    }
}
