package com.demo.music.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @NotBlank(message = "Artist Identifier is required")
    @Size(min = 4, max = 6, message = "Please use 4 to 6 character")
    @Column(updatable = false, unique = true)
    private String artistIdentifier;

    @NotNull(message = "Name is required")
    private String name;

    private String bio;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,
    mappedBy = "artist")
    private Set<Album> albums = new HashSet<>();

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,
    mappedBy = "artist")
    private Set<Track> tracks = new HashSet<>();

 public Artist(){

 }
    public long getId(){
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String firstName) {
        this.name = name;
    }

    public  String getBio(){
        return bio;
    }
    public void setBio(String bio){
        this.bio = bio;
    }

    public Set<Track> getTracks() {
        return tracks;
    }

    public void setTracks(Set<Track> tracks) {
        this.tracks = tracks;
    }

    public Set<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Set<Album> albums) {
        this.albums = albums;
    }


    public String getArtistIdentifier() {
        return artistIdentifier;
    }

    public void setArtistIdentifier(String artistIdentifier) {
        this.artistIdentifier = artistIdentifier;
    }
}
