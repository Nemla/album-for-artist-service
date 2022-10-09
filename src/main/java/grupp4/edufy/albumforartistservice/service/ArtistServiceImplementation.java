package grupp4.edufy.albumforartistservice.service;

import grupp4.edufy.albumforartistservice.model.Artist;
import grupp4.edufy.albumforartistservice.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArtistServiceImplementation implements ArtistService{

    private final ArtistRepository artistRepository;

    @Autowired
    public ArtistServiceImplementation(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public Artist findById(int theId) {
    Optional<Artist> result = artistRepository.findById(theId);
    Artist theArtist;
        if(result.isPresent()) {
        theArtist = result.get();
    } else {
        throw new RuntimeException("Could not fetch an artist with the id: " + theId);
    }
        return theArtist;
    }
}
