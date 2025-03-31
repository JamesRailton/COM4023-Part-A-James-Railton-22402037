import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SongList {
    List<Song> songList = new ArrayList<>(); // ArrayList to store songs
    Scanner scanner = new Scanner(System.in);

    // Constructor to initialise the song list with some sample songs
    public SongList() {
        songList.add(new Song("Shape of You", "Ed Sheeran", 3542));
        songList.add(new Song("Blinding Lights", "The Weeknd", 2875));
        songList.add(new Song("Bad Guy", "Billie Eilish", 2134));
        songList.add(new Song("Believer", "Imagine Dragons", 3290));
        songList.add(new Song("Levitating", "Dua Lipa", 1956));
        songList.add(new Song("Happier Than Ever", "Billie Eilish", 1743));
        songList.add(new Song("Someone You Loved", "Lewis Capaldi", 2468));
        songList.add(new Song("Watermelon Sugar", "Harry Styles", 2201));
        songList.add(new Song("Circles", "Post Malone", 2675));
        songList.add(new Song("Drivers License", "Olivia Rodrigo", 3102));
        songList.add(new Song("Sunflower", "Post Malone", 1800));
        songList.add(new Song("Dance Monkey", "Tones and I", 2029));
        songList.add(new Song("Peaches", "Justin Bieber", 1654));
        songList.add(new Song("Senorita", "Shawn Mendes", 1876));
        songList.add(new Song("Perfect", "Ed Sheeran", 3241));
        songList.add(new Song("Lose Yourself", "Eminem", 2839));
        songList.add(new Song("Thinking Out Loud", "Ed Sheeran", 2985));
        songList.add(new Song("Stay", "The Kid LAROI", 2347));
        songList.add(new Song("Old Town Road", "Lil Nas X", 2120));
        songList.add(new Song("Lucid Dreams", "Juice WRLD", 1950));
        songList.add(new Song("Counting Stars", "OneRepublic", 2722));
        songList.add(new Song("Royals", "Lorde", 1865));
        songList.add(new Song("Thunder", "Imagine Dragons", 2433));
        songList.add(new Song("7 Rings", "Ariana Grande", 2254));
        songList.add(new Song("Sicko Mode", "Travis Scott", 1793));
    }

    // Method to add a new song to the list
    public void addSong() {
        String songName;
        String artistName;
        int playCount;

        try{
            // Prompt user for song details
            System.out.println("Enter Song Name: ");
            songName = scanner.nextLine();
            System.out.println("Enter Artist Name: ");
            artistName = scanner.nextLine();
            System.out.println("Enter Play Count: ");
            playCount = scanner.nextInt();

            songList.add(new Song(songName, artistName, playCount)); // Add new song to the list
            System.out.println("Song Successfully Added");
            displaySongList(); // Display the updated song list
        } catch(Exception e){
            System.out.println("An error has occurred"); // Handle any exceptions
        }

    }

    // Method to remove a song from the list
    public void removeSong() {
        int removeSong;
        System.out.println("Enter the song number in the list below to remove song");
        displaySongList(); // Display the list of songs

        try{
            removeSong = scanner.nextInt();
            songList.remove(removeSong - 1); // Remove the song at the specified index
            System.out.println("Song Removed (Song number removed has been replaced with one above if available), " +
                    "Updated list below");
            displaySongList(); // Display the updated song list
        }catch(Exception e){
            System.out.println("An error has occurred"); // Handle any exceptions
        }
    }

    // Method to display the list of all songs
    public void displaySongList(){
        System.out.println("List of all songs");

        // Loop through the song list and print each song's details
        for(int i = 0; i < songList.size(); i++){
            System.out.printf("Song Number %d | Song Name: %s | Artist Name: %s | Play Count: %s %n", i + 1,
                    songList.get(i).getSongName(), songList.get(i).getArtistName(),
                    songList.get(i).getPlayCount()); // Print song details
        }
    }

    // Method to display songs with play count greater than or equal to a specified number
    public void displaySongByPlayNumber() {
        int playCount;
        System.out.println("Enter the number of plays used to filter songs by play count");

        try{
            playCount = scanner.nextInt();
            boolean songFound = false; // Flag to check if any song matches the criteria

            // Loop through the song list and print songs with play count greater than or equal to the specified number
            for(int i = 0; i < songList.size(); i++){
                if(songList.get(i).getPlayCount() >= playCount){
                    System.out.printf("Song Number %d | Song Name: %s | Artist Name: %s | Play Count: %s %n", i + 1,
                            songList.get(i).getSongName(), songList.get(i).getArtistName(),
                            songList.get(i).getPlayCount());
                    songFound = true; // Set flag to true if a song is found
                }
            }

            // If no songs match the criteria, print a message
            if(!songFound){
                System.out.println("No songs found with play count greater than or equal to " + playCount);
            }
        }catch (Exception e) {
            System.out.println("An error has occurred"); // Handle any exceptions
        }
    }

}
