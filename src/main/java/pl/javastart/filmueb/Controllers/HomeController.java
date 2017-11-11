package pl.javastart.filmueb.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.javastart.filmueb.model.Movie;
import pl.javastart.filmueb.repositories.FilmRepository;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    FilmRepository filmRepository;

    @GetMapping("/")
    public String filmDetails(Model model) {
        List<Movie> allMovies = filmRepository.getAllFilms();
        model.addAttribute("lista", allMovies);
        return "index";
    }

}
