package konkuk.ac.kr.navermovie.review;

import konkuk.ac.kr.navermovie.domian.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
