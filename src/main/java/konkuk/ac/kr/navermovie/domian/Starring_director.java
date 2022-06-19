package konkuk.ac.kr.navermovie.domian;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Starring_director {

    @Id @GeneratedValue
    private Long id;

    private String director_name;

    private String director_name_eng;

    @ManyToOne
    private Movie titleId;

    @ManyToOne
    private Director director_id;

}
