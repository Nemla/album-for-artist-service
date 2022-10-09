package grupp4.edufy.albumforartistservice.repository;

import grupp4.edufy.albumforartistservice.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Integer> {
}
