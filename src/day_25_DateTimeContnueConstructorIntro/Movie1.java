package day_25_DateTimeContnueConstructorIntro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie1 {
    public String country;
    public String title;
    public String genre;
    public LocalDate releaseDate;
    public String director;
    public ArrayList<String> casts;

    public Movie1(String country, String title, String genre, LocalDate releaseDate, String director) {
        casts = new ArrayList<>();
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;         // .format(DateTimeFormatter.ofPattern("y/dd/mm"));
        this.director = director;
    }


    public String toString() {
        return "Movie1{" +
                "\ncountry='" + country + '\'' +
                ", \ntitle='" + title + '\'' +
                ", \nGenre='" + genre + '\'' +
                ", \nreleaseDate=" + releaseDate +
                ", \ndirector='" + director + '\'' +
                ", \ncasts=" + casts +
                '}';
    }

    public void addCast(String member){
        casts.add(member);
    }

    public void addCasts(String[] members) {
        casts.addAll(Arrays.asList(members));
        /*
        for (int i = 0; i < members.length; i++) {
            addCast(members[i]);
        }
         */
    }
}


/*
Task04:
    1. Create a custom class named  Movie:
        Attributes:
            country, title, Genre, releaseDate, director, casts (ArrayList<String>)

        Add a constructor to set the country, title, release date, and director of the Movie

        Actions
            addCast(String): adds the given string argument to the arrayList casts
            addCasts(String[]): adds the given string array argument to the arrayList casts
            toString(): returns the name of country, title, release date, and total number of casts

    2. create a class called TestMovieObjects
            1. create an object of the movie:
                    title: Java Developer: Zero to Hero
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 04/18/2021
                    director: Kuzzat Altay
                    Casts: Ozzy, Ali, Muhtar and 5 more students from your group

        print the full info of the movie
 */