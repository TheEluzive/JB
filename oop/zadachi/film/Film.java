public class Film implements  IFIlm{

    private String name;
    private String genre;


    public Film() {
    }

    public Film(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    @Override
    public void show() {
        boolean isCorrect = true;

        if (name == null || name.equals("")) {
            System.out.println("Не указано название фильма, просмотр невозможен!");
            isCorrect = false;
        }
        if (genre == null || name.equals("")) {
            System.out.println("Не указан жанр фильма, просмотр невозможен!");
            isCorrect = false;
        }

        if (isCorrect)
            System.out.println("Смотрим фильм: \"" + name + "\", жанр \"" + genre + "\"");


    }

}
