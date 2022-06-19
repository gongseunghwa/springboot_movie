package konkuk.ac.kr.navermovie.starring_actors;

import konkuk.ac.kr.navermovie.domian.Starring_actors;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Starring_ActorRepository extends JpaRepository<Starring_actors,Long> {
    List<Starring_actors> findAllByTitleId(Long id);
}
