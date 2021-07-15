import java.util.ArrayList;
import java.util.Collections;

public class Playlist implements  IPlaylist{
    private ArrayList<Song> songList;

    public ArrayList<Song> getSongList() {
        return songList;
    }

    @Override
    public void addSong(Song song) {
        if (songList == null) songList = new ArrayList<Song>();
        if (songList.contains(song))
            System.out.println("Песня с таким названием - " + song.getName() + " - уже добавлена");
        else {
            songList.add(song);
            System.out.println("Добавлена песня " + song.getName());
        }
    }

    @Override
    public void snuffle() {
        Collections.shuffle(songList);
        System.out.println("Перемешиваю плейлист!!!");
    }
}
