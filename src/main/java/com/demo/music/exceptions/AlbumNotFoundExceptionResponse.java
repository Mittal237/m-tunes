package com.demo.music.exceptions;

public class AlbumNotFoundExceptionResponse {
    private String AlbumNotFound;

    public AlbumNotFoundExceptionResponse(String albumNotFound) {
        AlbumNotFound = albumNotFound;
    }

    public String getAlbumNotFound() {
        return AlbumNotFound;
    }

    public void setAlbumNotFound(String albumNotFound) {
        AlbumNotFound = albumNotFound;
    }
}
