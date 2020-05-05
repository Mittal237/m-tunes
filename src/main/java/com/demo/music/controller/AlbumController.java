package com.demo.music.controller;

import com.demo.music.model.Album;
import com.demo.music.services.AlbumService;
import com.demo.music.services.ValidationErrorMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/album")

public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @Autowired
    private ValidationErrorMapService validationErrorMapService;

//    @GetMapping("/{albumIdentifier}")
//    public ResponseEntity<?> getAlbumByAlbumIdentifier(@PathVariable String albumIdentifier){
//        Album album=albumService.findAlbumByAlbumIdentifier(albumIdentifier);
//        return new ResponseEntity<Album>(album, HttpStatus.OK);
//    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAlbumById(@PathVariable Long id){
        Album album = albumService.findAlbumById(id);
        return new ResponseEntity<Album>(album, HttpStatus.OK);
    }
    @CrossOrigin
    @GetMapping("/all")
    public Iterable<Album> findAllAlbums(){
        return albumService.findAllAlbums();
    }


    @GetMapping("/by/{name}")
    public Iterable<Album> getAllAlbumsByArtistId(@PathVariable String name){
        return albumService.findAllAlbumsByArtistId(name);
    }

}
