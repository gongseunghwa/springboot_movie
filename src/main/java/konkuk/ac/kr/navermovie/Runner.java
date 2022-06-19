package konkuk.ac.kr.navermovie;

import konkuk.ac.kr.navermovie.actor.ActorRepository;
import konkuk.ac.kr.navermovie.director.DirectorRepository;
import konkuk.ac.kr.navermovie.domian.*;
import konkuk.ac.kr.navermovie.genre.GenreRepository;
import konkuk.ac.kr.navermovie.movie.MovieRepository;
import konkuk.ac.kr.navermovie.movie_nationality.Movie_nationalityRepository;
import konkuk.ac.kr.navermovie.starring_actors.Starring_ActorRepository;
import konkuk.ac.kr.navermovie.starring_director.Starring_directorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;

@RequiredArgsConstructor
@Component
@Transactional
public class Runner implements ApplicationRunner {

    private final MovieRepository movieRepository;

    private final GenreRepository genreRepository;

    private final Movie_nationalityRepository movie_nationalityRepository;

    private final ActorRepository actorRepository;

    private final DirectorRepository directorRepository;

    private final Starring_ActorRepository starringActorRepository;

    private final Starring_directorRepository starring_directorRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Movie movie = Movie.builder()
                .title("LaLa land")
                .title_eng("LaLa land")
                .title_opendate("2016")
                .audience_score(8.91f)
                .netizen_score(8.62f)
                .playing_time("127m")
                .opening_date(LocalDate.now())
                .image("https://movie-phinf.pstatic.net/20201229_146/1609226288425JgdsP_JPEG/movie_image.jpg?type=m203_290_2")
                .movie_rate("12세 관람가")
                .build();

        movieRepository.save(movie);

        Actor actor = Actor.builder()
                .actor_name("Emma Stone")
                .born_date("1996/10/23")
                .actor_work("Main")
                .actor_award("winner")
                .build();
        actorRepository.save(actor);

        Starring_actors actors = Starring_actors.builder()
                .actor_id(actor)
                .titleId(movie)
                .actor_name("Emma Stone")
                .actor_name_eng("Emma Stone")
                .position("i don't know")
                .build();

        starringActorRepository.save(actors);

        Director director = Director.builder()
                .director_name("Damon sezel")
                .director_award("winner!!")
                .director_work("Lala land")
                .born_date("1996/20/12")
                .build();

        directorRepository.save(director);

        Starring_director director1 = Starring_director.builder()
                .director_id(director)
                .titleId(movie)
                .director_name("Damon sezel")
                .director_name_eng("Damon sezel")
                .build();
        starring_directorRepository.save(director1);

        Movie_nationality movie_nationality = Movie_nationality.builder()
                .country_name("America")
                .titleId(movie)
                .build();

        movie_nationalityRepository.save(movie_nationality);
    }
}
