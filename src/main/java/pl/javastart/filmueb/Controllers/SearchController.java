package pl.javastart.filmueb.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.javastart.filmueb.model.Movie;
import pl.javastart.filmueb.repositories.FilmRepository;

import java.util.List;

@Controller
public class SearchController {

    @Autowired
    private FilmRepository filmRepository;




    @GetMapping("/searchHome")
    public String  searchHome(Model model){
        model.addAttribute("movie", new Movie());
        return "searchHome";
    }


    @PostMapping("/search")
public String searchByName(Movie movie,  Model model)
    {
        List<Movie> movies = filmRepository.findByName(movie.getTitle());

        model.addAttribute("lista", movies);
        return "search";
    }
}
