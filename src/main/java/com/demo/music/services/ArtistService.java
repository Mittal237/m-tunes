package com.demo.music.services;

import com.demo.music.exceptions.ArtistIdException;
import com.demo.music.model.Artist;
import com.demo.music.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtistService {
    @Autowired
    private ArtistRepository artistRepository;

    //find single artist
    public Artist findArtistByIdentifier(String artistIdentifier){

        Artist artist=  artistRepository.findArtistByArtistIdentifier(artistIdentifier.toLowerCase());
        if (artist==null){
            throw new ArtistIdException("Artist does not exist");
        }
        return artist;
    }

    //find all artists
    public Iterable<Artist> findAllArtists(){
        return artistRepository.findAll();
    }

//
//    public Iterable<Artist> findAllByName(String name){
//        return artistRepository.findAllByName(name);
//    }




}
