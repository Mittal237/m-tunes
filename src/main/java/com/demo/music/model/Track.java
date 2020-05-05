package com.demo.music.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Track {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long trackId;

    @NotBlank(message = "Track Identifier is required")
    @Size(min = 4, max = 6, message = "Please use 4 to 6 character")
    @Column(updatable = false, unique = true)
    private String trackIdentifier;

    @NotNull(message = "Track name is Required")
    private String trackName;

    @URL(message = "Song URL has to be the proper URL")
    @NotNull(message = "URL is Required")
    private String url;



    @ManyToOne
    @JoinColumn(name = "Artist_Id", nullable = false, referencedColumnName = "id")
    private Artist artist;


    @ManyToOne
    @JoinColumn(name = "Album_Id", nullable = false, referencedColumnName = "id")
    private Album album;


    public Track(){
    }
    public long getTrackId() {
        return trackId;
    }

    public void setTrackId(long trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }



    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getTrackIdentifier() {
        return trackIdentifier;
    }

    public void setTrackIdentifier(String trackIdentifier) {
        this.trackIdentifier = trackIdentifier;
    }
}
