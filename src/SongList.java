import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SongList {
    List<Song> songList = new ArrayList<Song>();
    public void addSong() {
        Scanner scanner = new Scanner(System.in);
        String songName;
        String artistName;
        int playCount;

        System.out.println("Enter Song Name: ");
        songName = scanner.nextLine();
        System.out.println("Enter Artist Name: ");
        artistName = scanner.nextLine();
        System.out.println("Enter Play Count: ");
        playCount = scanner.nextInt();

        try{
            songList.add(new Song(songName, artistName, playCount));
        }
        catch(Exception e){
            System.out.println("An error occured");
        }

    }
    public void removeSong() {
        System.out.println("Enter the number of the song in the list below to remove ");
        for(int i = 0; i < songList.size(); i++){
            System.out.printf("Song%d: %s%n", i + 1, songList.get(i));
        }

    }
    public void displaySongList(){
        for(int i = 0; i < songList.size(); i++){
            System.out.printf("Song Number%d | Artist Name: %s | Play Count: %s ", i + 1, songList.get(i).getArtistName(),
                    songList.get(i).getPlayCount());
        }
    }
    public void displaySongOverPlayNumber(){

    }


}
