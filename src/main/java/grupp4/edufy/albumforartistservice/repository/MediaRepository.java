package grupp4.edufy.albumforartistservice.repository;

import grupp4.edufy.albumforartistservice.model.Artist;
import grupp4.edufy.albumforartistservice.model.Media;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MediaRepository extends JpaRepository<Media, Integer> {

    List<Media> findByArtistOrderByReleaseDateDesc(Artist theArtist);

}
