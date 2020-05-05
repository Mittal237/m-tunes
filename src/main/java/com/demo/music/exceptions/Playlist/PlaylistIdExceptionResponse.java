package com.demo.music.exceptions.Playlist;

public class PlaylistIdExceptionResponse {
    private Long id;
    public PlaylistIdExceptionResponse(Long id) {
        this.id = id;
    }

    public String getId() {
        return id.toString();
    }

    public void setId(Long id) {
        this.id = id;
    }
}
