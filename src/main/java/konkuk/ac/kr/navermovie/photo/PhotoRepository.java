package konkuk.ac.kr.navermovie.photo;

import konkuk.ac.kr.navermovie.domian.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<Photo,Long> {
}
