package dev.ipa;

import java.util.ArrayList;

public class Song {

    private String title;
    private double duration;

    public Song(String title, Double duration) {
       this.title = title;
       this.duration = duration;
    }

    private String getTitle() {
        return title;
    }

    private String toString(ArrayList<Song> songs) {
        return songs.toString();
    }
}
