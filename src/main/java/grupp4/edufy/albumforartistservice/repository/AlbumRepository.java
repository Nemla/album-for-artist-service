package grupp4.edufy.albumforartistservice.repository;

import grupp4.edufy.albumforartistservice.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AlbumRepository  extends JpaRepository<Album, Integer> {
}
