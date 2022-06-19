package konkuk.ac.kr.navermovie.domian;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Review {

    @Id @GeneratedValue
    private Long id;

    private String review_name;

    private String review_id;

    private LocalDateTime writing_date;

    @ManyToOne
    private Movie titleId;
}
