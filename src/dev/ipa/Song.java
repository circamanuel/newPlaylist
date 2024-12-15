package dev.ipa;

import java.util.ArrayList;

public class Song {

    private String title;
    private double duration;

    public Song(String title, Double duration) {
       this.title = title;
       this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + ": " + duration;
    }
}
