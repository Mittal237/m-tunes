package com.demo.music.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class ArtistNotFoundExceptionResponse {
    private String ArtistNotFound;

    public ArtistNotFoundExceptionResponse(String artistNotFound) {
        ArtistNotFound = artistNotFound;
    }

    public String getArtistNotFound() {
        return ArtistNotFound;
    }

    public void setArtistNotFound(String artistNotFound) {
        ArtistNotFound = artistNotFound;
    }

}


