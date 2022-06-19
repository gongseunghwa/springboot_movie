package konkuk.ac.kr.navermovie.domian;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@EqualsAndHashCode(of = "id")
@Builder @AllArgsConstructor @NoArgsConstructor
public class Movie {

    @GeneratedValue @Id
    @Column(name = "title_id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "title_eng")
    private String title_eng;

    @Column(name = "title_opendate")
    private String title_opendate;

    @Column(name = "audience_score")
    private Float audience_score;

    @Column(name = "netizen_score")
    private Float netizen_score;

    @Column(name = "playing_time")
    private String playing_time;

    @Column(name = "opening_date")
    private LocalDate opening_date;

    @Column(name = "image")
    private String image;

    @Column(name = "movie_rate")
    private String movie_rate;



    @OneToOne
    private Movie_nationality movie_nationality;


}
