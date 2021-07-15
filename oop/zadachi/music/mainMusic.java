import java.util.ArrayList;

public class mainMusic {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        Author author1 = new Author("автор1");
        Author author2 = new Author("автор2");
        Author author3 = new Author("автор3");

        Song song1 = new Song("Песня1", author1);
        Song song2 = new Song("Песня2", author2);
        Song song3 = new Song("Песня3", author3);
        Song song4 = new Song("Песня1", author3);

        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);
        playlist.addSong(song4);

        for (Song songs: playlist.getSongList()
             ) {
            songs.play();
        }

        playlist.snuffle();

        for (Song songs: playlist.getSongList()
        ) {
            songs.play();
        }
    }
}
