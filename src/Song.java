public class Song {
    private String songName;
    private String artistName;
    private int playCount;

    public Song(String songName, String artistName, int playCount) {
        this.songName = songName;
        this.artistName = artistName;
        this.playCount = playCount;
    }

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