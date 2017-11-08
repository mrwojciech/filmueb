package pl.javastart.filmueb;

/**
 * @param year to rok produkcji
 * @param photo to URL do zdjęcia
 * @param id to id filmu, ktore powinno byc nadawane automatycznie
 *
 * */
public class Movie {
    private String title;
    private String description;
    private String category;
    private int year;
    private String photo;
    private Long id=0L;

    public Movie(String title, String description, String category, int year, String photo, Long id) {
        this.title = title;
        this.description = description;
        this.category = category;
        this.year = year;
        this.photo = photo;
        this.id = id;
    }

    public Movie (){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tytuł: " + title +" ("+ year+ "); opis:" + description + "; gatunek:"+ category;
    }
}
