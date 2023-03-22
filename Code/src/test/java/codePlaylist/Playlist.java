package codePlaylist;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<String> songs;
    private int capacity;

    public Playlist(int capacity) {
        this.capacity = capacity;
        this.songs = new ArrayList<String>();
    }

    public void addSong(String song) {
        // If the playlist is full, remove the oldest song
        if (songs.size() == capacity) {
            songs.remove(0);
        }
        // Adding new song to the end of the playlist
        songs.add(song);
    }

    public void printPlaylist() {
        System.out.println("Playlist:");
        for (String song : songs) {
            System.out.println(song);
        }
    }

    public static void main(String[] args) {
        Playlist playlist = new Playlist(3);
        playlist.addSong("S1");
        playlist.addSong("S2");
        playlist.addSong("S3");
        playlist.printPlaylist(); // Output: Playlist: S1 S2 S3
        playlist.addSong("S4");
        playlist.printPlaylist(); // Output: Playlist: S2 S3 S4
        playlist.addSong("S2");
        playlist.printPlaylist(); // Output: Playlist: S3 S4 S2
        playlist.addSong("S1");
        playlist.printPlaylist(); // Output: Playlist: S4 S2 S1
    }
}
