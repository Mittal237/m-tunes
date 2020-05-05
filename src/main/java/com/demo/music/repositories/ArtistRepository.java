package com.demo.music.repositories;

import com.demo.music.model.Artist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends CrudRepository<Artist, Long> {

    @Override
    Iterable<Artist> findAllById(Iterable<Long> iterable);

    Artist findArtistByArtistIdentifier(String artistIdentifier);


    @Override
    Iterable<Artist> findAll();

    Artist findArtistByName(String name);
}