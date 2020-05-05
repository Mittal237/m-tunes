package com.demo.music.controller;

import com.demo.music.model.Artist;
import com.demo.music.services.ArtistService;
import com.demo.music.services.ValidationErrorMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RestController
@RequestMapping("api/artist")
public class ArtistController {

    @Autowired
    private ArtistService artistService;

    @Autowired
    private ValidationErrorMapService validationErrorMapService;

    @GetMapping("/{artistIdentifier}")
    public ResponseEntity<?> getArtistByIdentifier(@PathVariable String artistIdentifier){
        Artist artist=artistService.findArtistByIdentifier(artistIdentifier);
        return new ResponseEntity<Artist>(artist, HttpStatus.OK);
    }
    @CrossOrigin
    @GetMapping("/all")
    public Iterable<Artist> findAllArtists(){
        return artistService.findAllArtists();
    }
//    @GetMapping("/name/{name}")
//    public Iterable<Artist> getAllByName(String name){
//        return artistService.findAllByName(name);
//    }



}
