package dev.ipa;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs = new ArrayList<>();

    public Album(String name, String artist, ArrayList<Song> songs) {
        this.name = name;
        this.artist = artist;
        this.songs = songs;
    }

   // if song added return true else false
    private boolean addSongs(String title, Double duration) {
        if (findSong(title) != null) {
            return true;
        } else {
            return false;
        }
    }

    private String findSong(String name) {

        if (songs.contains(name)) {
            return name;
        } else {
            return null;
        }
    }

   // if song added (trackNr. Song) return true else false
    private boolean addToPlaylist(int trackerNumber, LinkedList<Song> songs) {

        return true;
    }
}

