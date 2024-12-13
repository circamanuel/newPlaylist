package dev.ipa;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Song songs = new Song("Time",3.00);

        // Arraylist erstellen und objecte hinzufuegen.
        ArrayList<Song> songList = new ArrayList<>();
        songList.add(songs);

        // Create Album with list and songs.
        Album album = new Album("Test", "Test", songList);

    }
}
