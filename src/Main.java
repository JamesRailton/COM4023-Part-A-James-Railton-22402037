import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SongList songList = new SongList();
        int option;

        System.out.println("Welcome to the SpotGram!");
        System.out.println("Please enter a number corresponding to the operations below");
        System.out.println("Number 1: Add a new song");
        System.out.println("Number 2: Remove a song");
        System.out.println("Number 3: Print a list of all songs");
        System.out.println("Number 4: Print a lost of songs over a given number of plays");
        option = scanner.nextInt();

        switch(option){
            case 1:
                songList.addSong();
                break;
            case 2:
                songList.removeSong();
                break;
            case 3:
                songList.displaySongList();
                break;
            case 4:
                songList.displaySongOverPlayNumber();
                break;
            default:
                System.out.println("An error occurred");
        }
    }
}
