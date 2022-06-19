package konkuk.ac.kr.navermovie.starring_director;

import konkuk.ac.kr.navermovie.domian.Starring_director;
import konkuk.ac.kr.navermovie.starring_actors.Starring_ActorRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Starring_directorRepository extends JpaRepository<Starring_director,Long> {

    Starring_director findAllByTitleId(Long id);
}
