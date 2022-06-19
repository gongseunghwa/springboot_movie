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
public class Actor {

    @Id @GeneratedValue
    private Long actor_id;

    private String actor_name;

    private String born_date;

    private String actor_work;

    private String actor_award;
}
