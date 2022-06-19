package konkuk.ac.kr.navermovie.domian;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Photo {
    @Id @GeneratedValue
    private Long id;

    private String photo;

    @ManyToOne
    private Movie titleId;
}
