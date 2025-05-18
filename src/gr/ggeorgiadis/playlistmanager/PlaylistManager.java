package gr.ggeorgiadis.playlistmanager;

import java.util.LinkedList;
import java.util.Scanner;

public class PlaylistManager {
    private final LinkedList<String> playlist;
    private final LinkedList<String> history;
    private final Scanner scanner;

    // Constructor

    public PlaylistManager() {
        playlist = new LinkedList<>();
        history = new LinkedList<>();
        scanner = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;

        while (running) {
            printMenu();
            System.out.print("Choose an option: ");
            String input = scanner.nextLine().trim();

            switch (input) {
                case "1" -> addSong();
                case "2" -> removeSong();
                case "3" -> displayPlaylist();
                case "4" -> playNext();
                case "5" -> playPrevious();
                case "6" ->  running = false;
            }
        }
        scanner.close();
    }

    private void printMenu() {
        System.out.println("\n🎵 Playlist Manager 🎵");
        System.out.println("1. Add song");
        System.out.println("2. Remove song");
        System.out.println("3. Display playlist");
        System.out.println("4. Play next song");
        System.out.println("5. Play previous song");
        System.out.println("6. Exit");
    }

    private void addSong() {
        System.out.println("Enter song title to add: ");
        String title = scanner.nextLine().trim();
        playlist.add(title);
        System.out.println("✅ '" + title + "' added to playlist.");
    }

    private void removeSong() {
        System.out.println("Enter song title to remove: ");
        String title = scanner.nextLine().trim();
        if (playlist.remove(title)) {
            System.out.println("✅ '" + title + "' removed.");
        } else {
            System.out.println("❌ Song not found.");
        }
    }

    private void displayPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("📭 Playlist is empty.");
        } else {
            int index = 1;
            for (String song : playlist) {
                System.out.println(index++ + ". " + song);
            }
        }
    }

    private void playNext() {
        if (!playlist.isEmpty()) {
            String currentSong = playlist.removeFirst(); // Remove the current song
            history.push(currentSong);                   // Save it in history

            if (!playlist.isEmpty()) {
                String nextSong = playlist.getFirst(); // Now this is the new song to play
                System.out.println("▶️ Now playing: " + nextSong);
            } else {
                System.out.println("🚫 No more songs to play.");
            }
        } else {
            System.out.println("🚫 Playlist is empty.");
        }
    }

    private void playPrevious() {
        if (!playlist.isEmpty()) {
            String previousSong = history.pop(); // Get the last played song.
            playlist.addFirst(previousSong);
            System.out.println("⏮️ Returned to: " + previousSong);
        } else {
            System.out.println("🚫 No previous songs.");
        }

    }
}
