package com.demo.music.controller;


import com.demo.music.model.Track;
import com.demo.music.services.TrackService;
import com.demo.music.services.ValidationErrorMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/track")
public class TrackController {
    @Autowired
    private TrackService trackService;

    @Autowired
    private ValidationErrorMapService  validationErrorMapService;

    @GetMapping("/{trackIdentifier}")
    public ResponseEntity<?> getTrackByIdentifier(@PathVariable String trackIdentifier){
        Track track=trackService.findTrackByIdentifier(trackIdentifier);
        return new ResponseEntity<Track>(track, HttpStatus.OK);
    }
    @CrossOrigin
    @GetMapping("/all")
    public Iterable<Track> findAllTracks(){
        return trackService.findAllTracks();

    }
    @GetMapping("/by/{albumName}")
    public Iterable<Track> findAllTracks(@PathVariable  String albumName){
        return trackService.findAllTracksByAlbumId(albumName);
    }




    
}
