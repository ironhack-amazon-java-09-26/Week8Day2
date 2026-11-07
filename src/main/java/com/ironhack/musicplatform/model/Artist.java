package com.ironhack.musicplatform.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "artists")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "artist_name", nullable = false)
    private String name;
    private String genre;

    @OneToOne(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private ArtistProfile artistProfile;

    @OneToMany(
            mappedBy = "artist",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private List<Album> albums = new ArrayList<>();
}
