package pl.javastart.filmueb.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.javastart.filmueb.Comment;
import pl.javastart.filmueb.model.Movie;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class FilmRepository {
    private List<Movie> movies;

    @Autowired
    public FilmRepository() {
        movies = new ArrayList<>();
        movies.add(new Movie("Avatar","jkdskf","SF",2009,"movie2.jpg",2L));
        movies.add(new Movie("Sami Swoi","desc1","komedia",2001,"movie1.jpg",1L));
        Movie movie = new Movie("Avatar", "jkdskf", "SF", 2009, "movie2.jpg", 3L);
        List<Comment> commentList = new ArrayList<>();
        commentList.add(new Comment("Jan", "Lipa", LocalDate.now(), movie));
        commentList.add(new Comment("Krzysztof", "Dla mnie super", LocalDate.now(), movie));
        movie.setComments(commentList);
        movies.add(movie);
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
