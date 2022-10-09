package grupp4.edufy.albumforartistservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "album")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String albumName;
    private LocalDate releaseDate;

    public int getId() {return id;}

    public void setId(int id) { this.id = id;
    }

    public String getAlbumName() { return albumName ;}

    public void setAlbumName(String albumName) {this.albumName = albumName; }

    public LocalDate getReleaseDate() {return releaseDate;}

    public void setReleaseDate(LocalDate releaseDate) {this.releaseDate = releaseDate;}
}
