package com.xworks.spotifyapp.songs;

public class Songs {
    public String songName;
    public String singerName;
    public String songMovieName;

    public void displayInfo(){

        System.out.println("the songName is" +this.songName );
        System.out.println("the singerName is" + this.singerName);
        System.out.println("the songMovie name is"+ this.songMovieName);
    }
}

