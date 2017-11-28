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
        movies.add(new Movie("Avatar", "jkdskf", "SF", 2009, "movie2.jpg", 2L));
        movies.add(new Movie("Sami Swoi", "desc1", "komedia", 2001, "movie1.jpg", 1L));
        movies.add(new Movie("Matrix", "Informatyk z Nowego Jorku jest ścigany przez dziwnych agentów.", "sci-fi", 1999, "movie3.jpg", 3L));
        movies.add(new Movie("Magia uczuc", "Dziewczynka w szpitalu poznaje ćpuna.", "przygodowy", 2005, "movie4.jpg", 4L));
        movies.add(new Movie("Chlopaki nie placzą", "Dobrze zapowiadający się muzyk wpada w tarapaty z mafią.", "komedia", 2000, "movie5.jpg", 5L));
        movies.add(new Movie("Rambo", "Były komandos, niesłusznie oskarżony ucieka z więzienia.", "wojenny", 1982, "movie6.jpg", 6L));
        movies.add(new Movie("Faceci w rajtuzach", "Banita toczy walki z okrutnym księciem, uciskającym podwładnych.", "komedia", 1993, "movie7.jpg", 7L));
        movies.add(new Movie("Faceci w czerni", "Młody policjant zostaje zatrudniony w jednostce walczącej z łotrami z kosmosu", "komedia", 1997, "movie8.jpg", 8L));

        Movie movie = new Movie("Avatar", "jkdskf", "SF", 2009, "movie2.jpg", 3L);
        List<Comment> commentList = new ArrayList<>();
        commentList.add(new Comment("Jan", "Lipa", LocalDate.now(), movie));
        commentList.add(new Comment("Krzysztof", "Dla mnie super", LocalDate.now(), movie));
        movie.setComments(commentList);
        movies.add(movie);
    }

    public List<Movie> getAllFilms() {
        return movies;
    }

    public Movie findById(Long id) {
        Movie result = null;
        for (Movie film : movies)
            if (id.equals(film.getId()))
                result = film;
        return result;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> findByName(String name) {

        List<Movie> result = new ArrayList<>();
        for (Movie movie :
                movies) {
            if (movie.getTitle().contains(name)) {
                result.add(movie);
            }


        }
        return result;
    }
}
