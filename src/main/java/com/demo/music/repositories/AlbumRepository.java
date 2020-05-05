package com.demo.music.repositories;

import com.demo.music.model.Album;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AlbumRepository extends CrudRepository<Album, Long> {

    @Override
    Iterable<Album> findAllById(Iterable<Long> iterable);

//    Album findAlbumByAlbumIdentifier(String albumIdentifier);
    Album findAlbumById(Long id);
    @Override
    Iterable<Album> findAll();

    Iterable<Album> findAllAlbumsByArtistId(Long id);

    Album findAlbumByAlbumName(String albumName);

}
