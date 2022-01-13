package day31_Constructors.Dinner;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country, title, genre, releaseDate, director;
    public ArrayList<String> casts = new ArrayList<>();

    public Movie(String country, String title, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
    }
    public void addCast(String cast) {
        casts.add(cast);
    }

    public void addCasts(String[] cast) {
        casts.addAll(Arrays.asList(cast));
    }

    public String toString() {
        return "Title: " + title + "\nCountry: " + country + "\nGenre: " + genre + "\nRelease Date: " + releaseDate + "\nDirector: " + director + "\nCasts: " + casts;
    }
}
/*
Movie Task:

	3.1. Create a class named Movie
	    Attributes:
	        country (String), title (String), Genre (String), releaseDate (String), director (String), casts (ArrayList<String>)

		Add a constructor to set the country, title, release date, and director of the Movie

	    Actions
	        addCast(String): adds the given string argument to the arrayList casts
	        addCasts(String[]): adds the given string array argument to the arrayList casts
	        toString(): returns the name of country, title, release date, and total number of casts

	        3.2create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 23
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

        print the full info of the movie


 */