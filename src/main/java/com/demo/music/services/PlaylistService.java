//package com.demo.music.services;
//
//import com.demo.music.exceptions.Playlist.PlaylistIdException;
//import com.demo.music.repositories.PlaylistRepository;
//import com.demo.music.repositories.TrackRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class PlaylistService {
//
//    @Autowired
//    private PlaylistRepository playlistRepository;
//
//    @Autowired
//    TrackRepository trackRepository;
//    //create playlist
//    public Playlist saveOrUpdatePlaylist(Playlist playlist){
//
//        playlist.setId(playlist.getId());
//
//        return playlistRepository.save(playlist);
//
//    }
//
////    public Set<Playlist> updatePlaylistBySong(Playlist playlist, Track track){
////         playlist.setId(playlist.getId());
////         track.setTrackId(track.getTrackId());
////
////
////         Set<Playlist> playlists = new HashSet<>();
////         Set<Track> tracks = new HashSet<>();
////         playlists.add(playlist);
////         playlist.setTracks(tracks);
////         return playlistRepository.save(Set<Playlist> playlists );
////    }
//
//
//
//    //get single playlist
//    public Playlist findPlaylistById(Long id){
//
//        Playlist playlist=  playlistRepository.findPlaylistById(id);
//        if (playlist==null){
//            throw new PlaylistIdException("Playlist does not exist");
//        }
//        return playlist;
//    }
//
//    //get all playlists
//    public Iterable<Playlist> findAllPlaylists(){
//        return playlistRepository.findAll();
//    }
//
//    //delete playlist
//    public boolean deletePlaylistById(Long id){
//        Playlist playlist=playlistRepository.findPlaylistById(id);
//
//        if (playlist==null){
//            throw new PlaylistIdException("Playlist id does not exist");
//        }
//
//        try {
//            playlistRepository.delete(playlist);
//            return true;
//        }
//        catch (Exception e){
//            return false;
//        }
//    }
//
//}
//
