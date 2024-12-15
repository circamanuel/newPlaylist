package dev.ipa;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

   // if song added return true else false
    public boolean addSong(String title, Double duration) {
        if (findSong(title) == null) {
            Song newSong = new Song(title, duration);
           songs.add(newSong);
           System.out.println(title + " Successfully added.");
            return true;
        } else {
            System.out.println(title + " Song already exists.");
            return false;
        }
    }

    private Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    //if song added (trackNr. Song) return true else false
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
      int index = trackNumber -1; // -1 because the array starts at 0.
      if (index >= 0 && index < songs.size()) {
          Song song = songs.get(index);
          playList.add(songs.get(index));
          System.out.println("Added to playlist " + song);
          return true;
      }
     System.out.println("Track number " + trackNumber + " is invalid.");
      return false;
    }

    // add playlist title of song and the playlist
    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song song = findSong(title); // find the song in the album
        if (song != null) {
            playList.add(song); // add song  to the playlist
            System.out.println(title + " was added to the Play List.");
            return true;
        }
        System.out.println("The song '" + title + "' does not exist in the album.");
        return false;
    }


}

