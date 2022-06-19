package konkuk.ac.kr.navermovie.main;

import konkuk.ac.kr.navermovie.domian.Movie;
import konkuk.ac.kr.navermovie.movie.MovieRepository;
import konkuk.ac.kr.navermovie.movie.MovieService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainController {


    private final MovieRepository movieRepository;

    private final MovieService service;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("movieList",service.findAll());
        model.addAttribute("something","hello nice to meet you");

        return "index";
    }

//    @GetMapping("/search/movie")
//    public String searchMovie(String keyword, Model model){
//        List<Movie> movieList = movieRepository.findByTitleContainsIgnoreCase(keyword);
//        model.addAttribute(movieList);
//        model.addAttribute("keyword",keyword);
//        return "search";
//    }
}
