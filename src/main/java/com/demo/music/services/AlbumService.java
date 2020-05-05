package com.demo.music.services;

import com.demo.music.exceptions.AlbumIdException;
import com.demo.music.exceptions.ArtistIdException;
import com.demo.music.model.Album;
import com.demo.music.model.Artist;
import com.demo.music.repositories.AlbumRepository;
import com.demo.music.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbumService {
    @Autowired
    private AlbumRepository albumRepository;
    @Autowired
    private ArtistRepository artistRepository;

//    public Album findAlbumByAlbumIdentifier(String albumIdentifier){
//
//        Album album=  albumRepository.findAlbumByAlbumIdentifier(albumIdentifier.toLowerCase());
//        if (album==null){
//            throw new AlbumIdException("Album does not exist");
//        }
//        return album;
//
//    }
    public Album findAlbumById(Long id){
        Album album = albumRepository.findAlbumById(id);
        return album;
    }

    public Iterable<Album> findAllAlbums(){
        return albumRepository.findAll();
    }


    public Iterable<Album> findAllAlbumsByArtistId(String name){
        Artist artist = artistRepository.findArtistByName(name);
        return albumRepository.findAllAlbumsByArtistId(artist.getId());

    }
}
