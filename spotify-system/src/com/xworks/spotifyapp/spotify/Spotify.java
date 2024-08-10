package com.xworks.spotifyapp.spotify;

import com.xworks.spotifyapp.songs.Songs;

public class Spotify {
    Songs songs;

    public Spotify(Songs songs) {
        this.songs = songs;
    }

    public void searchingsongs() {

        if (songs != null) {
            this.songs = songs;

        } else {
            System.out.println("song is not found");
        }
    }
}
