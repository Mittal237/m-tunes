//package com.demo.music.controller;
//
//import com.demo.music.services.PlaylistService;
//import com.demo.music.services.ValidationErrorMapService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//
//@CrossOrigin
//@RestController
//@RequestMapping("api/playlist")
//public class PlaylistController {
//
//    @Autowired
//    private PlaylistService playlistService;
//
//    @Autowired
//    private ValidationErrorMapService validationErrorMapService;
//
//    @PostMapping("")
//    public ResponseEntity<?> createNewPlaylist(@Valid @RequestBody Playlist playlist, BindingResult bindingResult){
//
//        ResponseEntity<?> errorMap =  validationErrorMapService.validationServiceMap(bindingResult);
//        if (errorMap != null){
//            return errorMap;
//        }
//
//        Playlist playlist1= playlistService.saveOrUpdatePlaylist(playlist );
//        return new ResponseEntity<Playlist>(playlist1, HttpStatus.OK);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<?> getPlaylistById(@PathVariable Long id){
//        Playlist playlist=playlistService.findPlaylistById(id);
//        return new ResponseEntity<Playlist>(playlist, HttpStatus.OK);
//    }
//
//    @GetMapping("/all")
//    public Iterable<Playlist> findAllPlaylists(){
//        return playlistService.findAllPlaylists();
//
//    }
//
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<String> deletePlaylistById(@PathVariable Long id){
//        boolean flag = playlistService.deletePlaylistById(id);
//
//        if (flag==true){
//            return new ResponseEntity<String>("Playlist '"+id+"' deleted", HttpStatus.OK);
//        }
//        return new ResponseEntity<String>("Playlist '"+id+"' not deleted! Exception occured", HttpStatus.OK);
//    }
//
//}
