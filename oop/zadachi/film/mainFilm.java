public class mainFilm {

    public static void main(String[] args) {

        Film avatar = new Film("Аватар", "Фантастика");
        avatar.show();

        Film batman = new Film("Бэтмен", "Боевик");
        batman.show();

        Film terminator = new Film("Терминатор", null);
        terminator.show();

    }


}
