import java.util.Objects;

public class Song implements ISong{
    private String name;
    private Author author;

    public Song(String name, Author author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void play() {
        System.out.println("Играет песня: " + name + ", автор: " + author.getName());
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        Song song = (Song) o;
        return Objects.equals(name, song.name);
    }


}
