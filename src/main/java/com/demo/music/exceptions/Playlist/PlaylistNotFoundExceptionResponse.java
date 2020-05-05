package com.demo.music.exceptions.Playlist;

public class PlaylistNotFoundExceptionResponse {
    private String playlistNotFound;

    public PlaylistNotFoundExceptionResponse(String playlistNotFound){
        playlistNotFound = playlistNotFound;
    }

    public String getPlaylistNotFound() {
        return playlistNotFound;
    }

    public void setPlaylistNotFound(String playlistNotFound) {
        this.playlistNotFound = playlistNotFound;
    }
}
