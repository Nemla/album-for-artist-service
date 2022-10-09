package grupp4.edufy.albumforartistservice.service;

import grupp4.edufy.albumforartistservice.model.Album;
import grupp4.edufy.albumforartistservice.model.Artist;
import grupp4.edufy.albumforartistservice.model.Media;
import grupp4.edufy.albumforartistservice.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumServiceImplementation implements AlbumService{

    private final AlbumRepository albumRepository;

    @Autowired
    public AlbumServiceImplementation(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Override
    public Album findById(int theId) {
        Optional<Album> result = albumRepository.findById(theId);
        Album theAlbum;
        if(result.isPresent()) {
            theAlbum = result.get();
        } else {
            throw new RuntimeException("Could not fetch an album with the id: " + theId);
        }
        return theAlbum;
    }
}
