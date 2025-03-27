import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SongList {
    List<Song> songList = new ArrayList<>();
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
    public void addSong() {
        Scanner scanner = new Scanner(System.in);
        String songName;
        String artistName;
        int playCount;
        try{
            System.out.println("Enter Song Name: ");
            songName = scanner.nextLine();
            System.out.println("Enter Artist Name: ");
            artistName = scanner.nextLine();
            System.out.println("Enter Play Count: ");
            playCount = scanner.nextInt();

            songList.add(new Song(songName, artistName, playCount));
            System.out.println("Song Successfully Added");
            displaySongList();
        } catch(Exception e){
            System.out.println("An error has occurred");
        }

    }
    public void removeSong() {
        int removeSong;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the song number in the list below to remove song");
        displaySongList();
        try{
            removeSong = scanner.nextInt();
            songList.remove(removeSong - 1);
            System.out.println("Song Removed, Updated list below");
            displaySongList();
        }catch(Exception e){
            System.out.println("An error has occurred");
        }
    }
    public void displaySongList(){
        System.out.println("List of all songs stored");
        for(int i = 0; i < songList.size(); i++){
            System.out.printf("Song Number %d | Artist Name: %s | Play Count: %s %n", i + 1, songList.get(i).getArtistName(),
                    songList.get(i).getPlayCount());
        }
    }
    public void displaySongOverPlayNumber(){

    }


}
