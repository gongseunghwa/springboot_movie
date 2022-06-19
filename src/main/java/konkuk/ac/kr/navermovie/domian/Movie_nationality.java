package konkuk.ac.kr.navermovie.domian;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Movie_nationality {

    @Id @GeneratedValue
    private Long id;

    private String country_name;

    @OneToOne
    @JoinColumn(name = "title_id")
    private Movie titleId;
}
