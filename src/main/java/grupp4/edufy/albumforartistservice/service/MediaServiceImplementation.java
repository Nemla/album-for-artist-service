package grupp4.edufy.albumforartistservice.service;

import grupp4.edufy.albumforartistservice.model.Album;
import grupp4.edufy.albumforartistservice.model.Artist;
import grupp4.edufy.albumforartistservice.model.Media;
import grupp4.edufy.albumforartistservice.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MediaServiceImplementation implements MediaService {

    private final MediaRepository mediaRepository;

    @Autowired
    public MediaServiceImplementation(MediaRepository mediaRepository) {
        this.mediaRepository = mediaRepository;
    }

    @Override
    public List<Media> findAllMediaForArtist(Artist theArtist) {
        return mediaRepository.findByArtistOrderByReleaseDateDesc(theArtist);
    }
}
