package konkuk.ac.kr.navermovie.movie;

import konkuk.ac.kr.navermovie.domian.Movie;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
//    List<Movie> findByTitleContainsIgnoreCase(String keyword);

}
