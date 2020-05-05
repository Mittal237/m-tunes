package com.demo.music.services;

import com.demo.music.exceptions.TrackIdException;
import com.demo.music.model.Album;
import com.demo.music.model.Artist;
import com.demo.music.model.Track;
import com.demo.music.repositories.AlbumRepository;
import com.demo.music.repositories.ArtistRepository;
import com.demo.music.repositories.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrackService {
    @Autowired
    private TrackRepository trackRepository;
    @Autowired
    private AlbumRepository albumRepository;

    public Track findTrackByIdentifier(String trackIdentifier) {

        Track track = trackRepository.findTrackByTrackIdentifier(trackIdentifier.toLowerCase());
        if (track == null) {
            throw new TrackIdException("Track does not exist");
        }
        return track;
    }


    public Iterable<Track> findAllTracks() {
        return trackRepository.findAll();
    }



    public Iterable<Track> findAllTracksByAlbumId(String albumName){

        Album album = albumRepository.findAlbumByAlbumName(albumName);

        return trackRepository.findAllTracksByAlbumId(album.getId());
    }






}
