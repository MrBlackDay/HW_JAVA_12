public class FilmsManager {

    private String[] films = new String[0];
    private int limit;

    public FilmsManager() {
        this.limit = 5;
    }

    public FilmsManager(int limit) {
        this.limit = limit;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        this.films = tmp;
    }


    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int length;
        if (films.length < 5) {
            length = films.length;
        } else {
            length = 5;
        }
        String tmp[] = new String[length];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}



