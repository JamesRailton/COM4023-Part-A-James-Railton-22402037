public class Song {
    private final String songName;
    private final String artistName;
    private final int playCount;

    // Constructor to initialize the song properties
    public Song(String songName, String artistName, int playCount) {
        this.songName = songName;
        this.artistName = artistName;
        this.playCount = playCount;
    }

    // Getters for the song properties
    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public int getPlayCount() {
        return playCount;
    }
}