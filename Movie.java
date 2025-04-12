package io.github.sahilkr0225.moviecollectionorganiser;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.Objects;

@Entity
@Table(name = "Movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @NotBlank(message = "Movie name is required")
    private String title;
    private String genre;
    private int year;
    private String director;

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return year == movie.year && Objects.equals(title, movie.title) && Objects.equals(genre, movie.genre) && Objects.equals(director, movie.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, genre, year, director);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                ", director='" + director + '\'' +
                '}';
    }

    public Movie(String title, String genre, int year, String director) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.director = director;



    }
}

