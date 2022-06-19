package konkuk.ac.kr.navermovie.genre;

import konkuk.ac.kr.navermovie.domian.Genre;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface GenreRepository extends JpaRepository<Genre,Long> {

    List<Genre> findAllByTitleId(Long id);

}
