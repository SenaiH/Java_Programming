package day_25_DateTimeContnueConstructorIntro;

import java.time.LocalDate;

public class TestMovieObject {
    public static void main(String[] args) {
        String genre = "Adventure, Comedy, Thriller";
        String title = "Java Developer: Zero to Hero";
        String[] casts = {"Ozzy", "Ali", "Muhtar", "Akbar", "Gurhan", "Saim", "Murodil", "Nadir", "Guljannet"};

        Movie1 film1 = new Movie1("Eritrea","Success","Drama",LocalDate.of(2020,2,2),"Senai");


        film1.addCasts(new String[]{"Salem","Selam","Senai","Adam","Saim","Muhtar"});

        System.out.println(film1);
    }

}
/*
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