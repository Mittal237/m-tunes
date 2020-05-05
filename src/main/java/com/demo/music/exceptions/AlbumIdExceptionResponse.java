package com.demo.music.exceptions;

public class AlbumIdExceptionResponse {
    private String albumIdentifier;
    public AlbumIdExceptionResponse(String albumdentifier) {
        this.albumIdentifier = albumdentifier;
    }

    public String getAlbumIdentifier(){
        return albumIdentifier;
    }
    public void setAlbumIdentifier(String albumIdentifier){
        this.albumIdentifier=albumIdentifier;
    }

}
