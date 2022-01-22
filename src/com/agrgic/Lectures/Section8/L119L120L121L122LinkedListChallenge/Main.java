package com.agrgic.Lectures.Section8.L119L120L121L122LinkedListChallenge;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);

        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);

        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlaylist("You can't do it right", playList);
        albums.get(0).addToPlaylist("Holy man", playList);
        albums.get(0).addToPlaylist("Speed king", playList); // Does Not Exist
        albums.get(0).addToPlaylist(9, playList);
        albums.get(1).addToPlaylist(8, playList);
        albums.get(1).addToPlaylist(3, playList);
        albums.get(1).addToPlaylist(2, playList);
        albums.get(1).addToPlaylist(24, playList); // There is no track 24

        play(playList);
    } // main method

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playlist.listIterator();

        if (playlist.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing - " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;

                case 1:
                    if (!forward)
                        if (listIterator.hasNext())
                            listIterator.next();

                    forward = true;

                    if (listIterator.hasNext())
                        System.out.println("Now playing - " + listIterator.next().toString());
                    else {
                        System.out.println("Reached the end of playlist");
                        forward = false;
                    }

                    break;

                case 2:
                    if (forward)
                        if (listIterator.hasPrevious())
                            listIterator.previous();

                    forward = false;

                    if (listIterator.hasPrevious())
                        System.out.println("Now playing - " + listIterator.previous().toString());
                    else {
                        System.out.println("Reached the start of playlist");
                        forward = true;
                    }

                    break;

                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("Playlist at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("Playlist reached the end of the list");
                        }
                    }

                    break;

                case 4:
                    printList(playlist);
                    break;

                case 5:
                    printMenu();
                    break;

                case 6:
                    if (playlist.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    } // play method

    private static void printMenu() {
        System.out.println("Available actions:\r");
        System.out.println("""
                0 - Quit
                1 - Play next song
                2 - Play previous song
                3 - Replay current song
                4 - List songs in playlist
                5 - Print available actions
                6 - Delete current song from playlist
                """);
    } // printMenu method

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("=======================");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=======================");
    }

} // Main class
