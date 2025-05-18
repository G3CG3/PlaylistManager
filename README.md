# Playlist Manager

A simple Java console application demonstrating the use of `LinkedList` from the Java Collections Framework.

## Overview

This project allows users to manage a music playlist through the console. It supports operations like:

- Adding songs to the playlist
- Playing the next or previous song
- Viewing the complete song list

It uses a `LinkedList` to store and navigate the playlist.

## How to Run

1. Compile the project in your IDE (e.g., IntelliJ).
2. Run the `PlaylistManager` class.
3. Interact with the console to manage and play songs in the playlist.

## Sample Output

🎵 Playlist Manager 🎵
1. Add song
2. Remove song
3. Display playlist
4. Play next song
5. Play previous song
6. Exit
   Choose an option: 1 <br>
   Enter song title to add: <br>
   Mask off <br>
   ✅ 'Mask off' added to playlist.

🎵 Playlist Manager 🎵
1. Add song
2. Remove song
3. Display playlist
4. Play next song
5. Play previous song
6. Exit
   Choose an option: 1 <br>
   Enter song title to add: <br>
   Kings Never Die <br>
   ✅ 'Kings Never Die' added to playlist.

🎵 Playlist Manager 🎵
1. Add song
2. Remove song
3. Display playlist
4. Play next song
5. Play previous song
6. Exit
   Choose an option: 1 <br>
   Enter song title to add: <br>
   The Boss <br>
   ✅ 'The Boss' added to playlist.

🎵 Playlist Manager 🎵
1. Add song
2. Remove song
3. Display playlist
4. Play next song
5. Play previous song
6. Exit
   Choose an option: 3


1. Mask off
2. Kings Never Die
3. The Boss

🎵 Playlist Manager 🎵
1. Add song
2. Remove song
3. Display playlist
4. Play next song
5. Play previous song
6. Exit
   Choose an option: 4 <br>
   ▶️ Now playing: Kings Never Die

🎵 Playlist Manager 🎵
1. Add song
2. Remove song
3. Display playlist
4. Play next song
5. Play previous song
6. Exit
   Choose an option: 5 <br>
   ⏮️ Returned to: Mask off

🎵 Playlist Manager 🎵
1. Add song
2. Remove song
3. Display playlist
4. Play next song
5. Play previous song
6. Exit
   Choose an option: 2
   Enter song title to remove: <br>
   Kings Never Die <br>
   ✅ 'Kings Never Die' removed.

🎵 Playlist Manager 🎵
1. Add song
2. Remove song
3. Display playlist
4. Play next song
5. Play previous song
6. Exit <br>
   Choose an option: 6

Process finished with exit code 0

---

## Concepts Demonstrated

- LinkedList usage for dynamic playlist and playback history management
- Basic user input handling with `Scanner`
- Console menu-driven application design
- Stack behavior (using LinkedList as a stack) for playback history
- Mutable collection operations (add, remove, peek)
- Control flow with switch expressions (Java 14+ style)
- Simple state management in a console app
- Encapsulation of playlist logic in a dedicated class

---

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

Feel free to extend this project with features like shuffle, repeat, or playlist saving/loading!