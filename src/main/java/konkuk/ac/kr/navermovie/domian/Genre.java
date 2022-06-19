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
public class Genre {

    @Id @GeneratedValue
    private Long id;

    private String genre_name;


    @ManyToOne
    @JoinColumn(name = "title_id")
    private Movie titleId;
}
