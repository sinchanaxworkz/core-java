package com.xworks.bookmyshow.bookmyshow;

import com.xworks.bookmyshow.movies.Movies;

public class BookmyShow {
    Movies movies;
    public BookmyShow(Movies movies){
        System.out.println("movie ticket  is invoked");
        System.out.println("no of parameter is : 1");
        System.out.println("type of parameter : Contacts type");
        this.movies = movies;
    }


    public void showMovieInfo(){
        if(movies!=null)
            this.movies.MovieDetails();
        else
            System.out.println("No Contacts found");



    }



    }

