public class FilmsManager {
    private int limit;
    private String[] films = new String[0];

    public FilmsManager() {

        this.limit = 5;
    }

    public FilmsManager(int limit) {
        if (limit < 0) {
            System.out.printf("Установлено некорректное значение, количество постеров не может быть отрицательным");
        } else {
            this.limit = limit;
        }
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
        if (films.length < limit) {
            length = films.length;
        } else {
            length = limit;
        }
        String tmp[] = new String[length];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}



