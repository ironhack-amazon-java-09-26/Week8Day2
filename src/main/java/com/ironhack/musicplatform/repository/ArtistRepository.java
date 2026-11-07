package com.ironhack.musicplatform.repository;

import com.ironhack.musicplatform.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository  extends JpaRepository<Artist, Integer> {
}
