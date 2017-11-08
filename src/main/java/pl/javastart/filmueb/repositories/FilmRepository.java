package pl.javastart.filmueb.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.javastart.filmueb.model.Movie;


import java.util.ArrayList;
import java.util.List;
//tymczasowo

@Repository
public class FilmRepository {
    private List<Movie> movies;

    @Autowired
    public FilmRepository() {
        movies = new ArrayList<>();
        movies.add(new Movie("title1","desc1","komedia",2001,"url12",1L));
        movies.add(new Movie("Avatar","jkdskf","SF",2009,"bsdkbdsksd",2L));
    }

    public List<Movie> getAllFilms(){return movies;}

    public Movie findById(Long id) {
        Movie result = null;
        for (Movie film : movies)
            if (id.equals(film.getId()))
                result = film;
        return result;
    }
    public void addMovie(Movie movie){
        movies.add(movie);
    }
}
