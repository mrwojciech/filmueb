package pl.javastart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MovieController {

    @GetMapping("/addmovieform")
    public String addMovieForm(Model model){
        model.addAttribute("movie", new Movie());
        return "addmovie";
    }

    @PostMapping("/addmovie")
    public void addMovie(){
    }
}