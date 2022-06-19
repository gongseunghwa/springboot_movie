package konkuk.ac.kr.navermovie.domian;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Starring_actors {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private Movie titleId;

    @ManyToOne
    private Actor actor_id;

    private String actor_name;

    private String actor_name_eng;

    private String position;
}
