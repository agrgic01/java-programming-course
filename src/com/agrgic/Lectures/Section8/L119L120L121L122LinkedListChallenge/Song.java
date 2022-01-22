package com.agrgic.Lectures.Section8.L119L120L121L122LinkedListChallenge;

public class Song {

    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Song: " + this.title + ", Duration: " + this.duration;
    }

} // Song class

