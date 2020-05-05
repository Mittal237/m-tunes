package com.demo.music.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Size(min = 4, max = 6, message = "Please use 4 to 6 character")
    @Column(updatable = false, unique = true)
    private String albumIdentifier;

    @NotNull(message = "Album Name is Required")
    private String albumName;


    @Column(name = "IMAGE")
    private String albumImage;


    @ManyToOne
    @JoinColumn(name = "artistId", nullable = false, referencedColumnName ="id" )
    private Artist artist;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "album")
    private Set<Track> tracks =new HashSet<>();

    public Album(){

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getAlbumImage() {
        return albumImage;
    }

    public void setAlbumImage(String albumImage) {
        this.albumImage = albumImage;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Set<Track> getTracks() {
        return tracks;
    }

    public void setTracks(Set<Track> tracks) {
        this.tracks = tracks;
    }


    public String getAlbumIdentifier() {
        return albumIdentifier;
    }

    public void setAlbumIdentifier(String albumIdentifier) {
        this.albumIdentifier = albumIdentifier;
    }

}
