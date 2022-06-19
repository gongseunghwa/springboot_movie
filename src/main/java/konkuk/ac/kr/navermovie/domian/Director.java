package konkuk.ac.kr.navermovie.domian;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Director {
    @Id @GeneratedValue
    private Long director_id;

    private String director_name;

    private String born_date;

    private String director_work;

    private String director_award;
}
