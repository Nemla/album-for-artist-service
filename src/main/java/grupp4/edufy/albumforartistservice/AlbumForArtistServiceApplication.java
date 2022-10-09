package grupp4.edufy.albumforartistservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
public class AlbumForArtistServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlbumForArtistServiceApplication.class, args);
    }

}
