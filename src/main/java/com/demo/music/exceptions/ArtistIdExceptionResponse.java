package com.demo.music.exceptions;

public class ArtistIdExceptionResponse {
    private String artistIdentifier;

    public ArtistIdExceptionResponse(String artistIdentifier) {
        this.artistIdentifier = artistIdentifier;
    }

    public String getArtistIdentifier(){
        return artistIdentifier;
    }

    public void setArtistIdentifier(String artistIdentifier) {
        this.artistIdentifier = artistIdentifier;
    }
}
