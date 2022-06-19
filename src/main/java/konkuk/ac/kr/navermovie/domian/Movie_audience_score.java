package konkuk.ac.kr.navermovie.domian;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Movie_audience_score {

    @Id @GeneratedValue
    private Long id;

    private Integer audience_score;

    private String audience_text;

    private String audience_id;

    private LocalDate writing_date;

    private Integer num_like;

    private Integer num_unlike;

    @ManyToOne
    private Movie titleId;
}
