package com.xworks.bookmyshow;

import com.xworks.bookmyshow.bookmyshow.BookmyShow;
import com.xworks.bookmyshow.movies.Movies;

public class BookmyShowRunner {

        public static void main(String[] args) {
            Movies movies=new Movies();

            movies.movieName="shoo";
            movies.moviePrice=450;
            movies.numberOfTickets=4;




            BookmyShow bookmyShow =new BookmyShow(movies);

            bookmyShow.showMovieInfo();

        }
    }

