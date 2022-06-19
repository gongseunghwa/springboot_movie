package konkuk.ac.kr.navermovie.movie_nationality;

import konkuk.ac.kr.navermovie.domian.Movie_nationality;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Movie_nationalityRepository extends JpaRepository<Movie_nationality,Long> {
    Movie_nationality findByTitleId(Long id);
}
