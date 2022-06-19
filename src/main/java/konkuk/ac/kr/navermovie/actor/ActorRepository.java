package konkuk.ac.kr.navermovie.actor;

import konkuk.ac.kr.navermovie.domian.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor,Long> {
}
