package com.agrgic.CodingExercises.CE46Playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("Augment", "Erra");
        album.addSong("Ultraviolet", 3.35);
        album.addSong("Ultraviolet", 3.35); // shouldn't work, -duplicate
        album.addSong("Frostbite", 4.45);

        albums.add(album);

        Album album2 = new Album("Drift", "Erra");
        album2.addSong("Drift", 4.23);
        album2.addSong("Sleeper", 5.37);

        albums.add(album2);

        LinkedList<Song> playlist = new LinkedList<>();

        albums.get(0).addToPlaylist("Ultraviolet", playlist);
        albums.get(0).addToPlaylist("Potato", playlist);
        albums.get(0).addToPlaylist("Frostbite", playlist);
        albums.get(1).addToPlaylist("Drift", playlist);
        albums.get(1).addToPlaylist("Petoto", playlist);
        albums.get(1).addToPlaylist("Sleeper", playlist);

        play(playlist);

    } // main method

    private static void play(LinkedList<Song> playlist) {
        ListIterator<Song> listIterator = playlist.listIterator();

        if (playlist.size() == 0) {
            System.out.println("Playlist empty");
        } else {
            while(listIterator.hasNext())
            System.out.println(listIterator.next());
        }
    } // play method

} // Main class
