package konkuk.ac.kr.navermovie.movie;

import konkuk.ac.kr.navermovie.domian.Actor;
import konkuk.ac.kr.navermovie.domian.Genre;
import konkuk.ac.kr.navermovie.domian.Movie;
import konkuk.ac.kr.navermovie.domian.Starring_actors;
import konkuk.ac.kr.navermovie.genre.GenreRepository;
import konkuk.ac.kr.navermovie.movie_nationality.Movie_nationalityRepository;
import konkuk.ac.kr.navermovie.photo.PhotoRepository;
import konkuk.ac.kr.navermovie.starring_actors.Starring_ActorRepository;
import konkuk.ac.kr.navermovie.starring_director.Starring_directorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    private final PhotoRepository photoRepository;

    private final GenreRepository genreRepository;

    private final Starring_ActorRepository starringActorRepository;

    private final Starring_directorRepository starring_directorRepository;
    private final Movie_nationalityRepository movie_nationalityRepository;
    public List<MovieDto> findAll(){
        List<Movie> movieList = movieRepository.findAll();
        List<MovieDto> resultList = new ArrayList<>();
        movieList.forEach(movie -> {
            MovieDto dto = MovieDto.builder()
                    .title(movie.getTitle())
                    .title_eng(movie.getTitle_eng())
                    .title_opendate(movie.getTitle_opendate())
                    .audience_score(movie.getAudience_score())
                    .netizen_score(movie.getNetizen_score())
                    .playing_time(movie.getPlaying_time())
                    .opening_date(movie.getOpening_date())
                    .image(movie.getImage())
                    .movie_rate(movie.getMovie_rate())
                    .genreList(new ArrayList<>())
//                    .country_name(movie_nationalityRepository.findAllByTitleId(movie.getId()).get(0).getCountry_name())
//                    .director(starring_directorRepository.findAllByTitleId(movie.getId()).getDirector_name())
                    .actors(new ArrayList<>())
                    .build();

//            String country_name = movie_nationalityRepository.findByTitleId(movie.getId()).getCountry_name();
//            dto.setCountry_name(country_name);
//
//            List<Genre> genreList = genreRepository.findAllByTitleId(movie.getId());
//            dto.getGenreList().addAll(genreList);
//
//            List<Starring_actors> actorList = starringActorRepository.findAllByTitleId(movie.getId());
//            dto.getActors().addAll(actorList);

            resultList.add(dto);
        });

        return resultList;

    }
}
