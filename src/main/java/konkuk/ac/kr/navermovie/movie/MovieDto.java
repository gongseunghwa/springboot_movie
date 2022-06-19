package konkuk.ac.kr.navermovie.movie;

import konkuk.ac.kr.navermovie.domian.Genre;
import konkuk.ac.kr.navermovie.domian.Starring_actors;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter @Builder

public class MovieDto {
    private String title;

    private String title_eng;

    private String title_opendate;

    private Float audience_score;

    private Float netizen_score;

    private String playing_time;

    private LocalDate opening_date;

    private String image;

    private String movie_rate;

    private List<Genre> genreList = new ArrayList<>();

    private String country_name;

    private String director;

    private List<Starring_actors> actors;
}
