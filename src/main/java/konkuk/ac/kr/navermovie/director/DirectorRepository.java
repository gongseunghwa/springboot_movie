package konkuk.ac.kr.navermovie.director;

import konkuk.ac.kr.navermovie.domian.Director;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorRepository extends JpaRepository<Director,Long> {
}
