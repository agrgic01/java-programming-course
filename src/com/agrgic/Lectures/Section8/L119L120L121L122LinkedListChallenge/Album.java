package com.agrgic.Lectures.Section8.L119L120L121L122LinkedListChallenge;

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

    private Song findSong(String title) {
        for (Song checkedSong : songs) {
            if (checkedSong.getTitle().equals(title))
                return checkedSong;
        }

        return null;
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }

        return false;
    } // addSong method

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;

        if (index >= 0 && index <= songs.size()) {
            playlist.add(songs.get(index));
            return true;
        }

        System.out.println("This album doesn't have a track " + trackNumber);
        return false;
    } // addToPlaylist method

    public boolean addToPlaylist(String songTitle, LinkedList<Song> playlist) {
        Song checkedSong = findSong(songTitle);

        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }

        System.out.println("This album doesn't have a track " + songTitle);
        return false;
    } // addToPlaylist method #2

} // Album class
