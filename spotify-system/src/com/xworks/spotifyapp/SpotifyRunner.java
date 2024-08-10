package com.xworks.spotifyapp;

import com.xworks.spotifyapp.songs.Songs;
import com.xworks.spotifyapp.spotify.Spotify;

public class SpotifyRunner {
    public static void main(String[] args) {
        Songs songs=new Songs();
        songs.songName="3peg";
        songs.songMovieName="album";
        songs.singerName="chandan Shetty";


        Spotify spotify=new Spotify(songs);
        spotify.searchingsongs();
    }
}
