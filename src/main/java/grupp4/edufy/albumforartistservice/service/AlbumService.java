package grupp4.edufy.albumforartistservice.service;

import grupp4.edufy.albumforartistservice.model.Album;
import grupp4.edufy.albumforartistservice.model.Artist;
import grupp4.edufy.albumforartistservice.model.Media;

import java.util.List;

public interface AlbumService {

    Album findById(int theId);
}
