package com.demo.music.repositories;

import com.demo.music.model.Track;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface TrackRepository extends CrudRepository<Track, Long> {
@Override
    Iterable<Track> findAllById(Iterable<Long> iterable);

    Track findTrackByTrackIdentifier(String trackIdentifier);

    @Override
    Iterable<Track> findAll();

    Iterable<Track> findAllTracksByAlbumId(Long id);


}


