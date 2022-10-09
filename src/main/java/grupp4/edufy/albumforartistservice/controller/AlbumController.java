package grupp4.edufy.albumforartistservice.controller;


import grupp4.edufy.albumforartistservice.model.Album;
import grupp4.edufy.albumforartistservice.model.Artist;
import grupp4.edufy.albumforartistservice.model.Media;
import grupp4.edufy.albumforartistservice.service.AlbumService;
import grupp4.edufy.albumforartistservice.service.ArtistService;
import grupp4.edufy.albumforartistservice.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/")
public class AlbumController {

    private final AlbumService albumService;
    private final MediaService mediaService;
    private final ArtistService artistService;


    @Autowired
    public AlbumController(MediaService mediaService,
                           AlbumService albumService,
                           ArtistService artistService) {
        super();
        this.mediaService = mediaService;
        this.albumService = albumService;
        this.artistService = artistService;
    }


    @GetMapping("/albums")
    public List<Album> allAlbumsForArtist(@RequestBody Artist theArtist) {
        List<Media> allMediaForArtist = mediaService.findAllMediaForArtist(theArtist);

        List<Album> albumList = allMediaForArtist.stream()
                .map(Media::getAlbum)
                .collect((Collectors.toList()));
        return albumList;
    }
}
