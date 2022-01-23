package com.agrgic.CodingExercises.CE46Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    private Song findSong(String songTitle) {
        for (int i = 0; i < songs.size(); i++) {
            Song checkedSong = songs.get(i);

            if (checkedSong.getTitle().equals(songTitle)) {
                return checkedSong;
            }
        }

        return null;
    }

    public boolean addSong(String name, double duration) {
        if (findSong(name) == null) {
            songs.add(new Song(name, duration));
            return true;
        }

        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist) {
        if (findSong(title) != null) {
            playlist.add(findSong(title));
            return true;
        }

        return false;
    }

} // Album class