import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

    //Лимит фильмов по умолчанию (5)
    //findAll
    @Test
    public void shouldBeEmpty() { //Вызов пустой афиши

        FilmsManager manager = new FilmsManager();

        String[] actual = manager.findAll();
        String[] expected = {};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findAllOneFilm() { //Вывод одного фильма (ниже лимита по умолчанию)

        FilmsManager manager = new FilmsManager();

        manager.addFilm("1");

        String[] actual = manager.findAll();
        String[] expected = {"1"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findAllFourFilms() { //Добавление 4-х фильмов (граничные значения)

        FilmsManager manager = new FilmsManager();

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");
        manager.addFilm("4");

        String[] actual = manager.findAll();
        String[] expected = {"1", "2", "3", "4"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findAllFiveFilms() { //Добавление 5-ти фильмов (граничные значения)

        FilmsManager manager = new FilmsManager();

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");
        manager.addFilm("4");
        manager.addFilm("5");

        String[] actual = manager.findAll();
        String[] expected = {"1", "2", "3", "4", "5"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findAllSixFilms() { //Добавление 6-ти фильмов (граничные значения)

        FilmsManager manager = new FilmsManager();

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");
        manager.addFilm("4");
        manager.addFilm("5");
        manager.addFilm("6");

        String[] actual = manager.findAll();
        String[] expected = {"1", "2", "3", "4", "5", "6"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findAllTenFilms() { //Вывод добавленных фильмов свыше лимита по умолчанию

        FilmsManager manager = new FilmsManager();

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");
        manager.addFilm("4");
        manager.addFilm("5");
        manager.addFilm("6");
        manager.addFilm("7");
        manager.addFilm("8");

        String[] actual = manager.findAll();
        String[] expected = {"1", "2", "3", "4", "5", "6", "7", "8"};

        Assertions.assertArrayEquals(actual, expected);
    }

    //findLast
    @Test
    public void findLastDefault() { //Вывод добавленных фильмов в обратном порядке

        FilmsManager manager = new FilmsManager();

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");

        String[] actual = manager.findLast();
        String[] expected = {"3", "2", "1"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastUnderLimitDefault() { //Вывод всех добавленных фильмов в обратном порядке (граничные значения)

        FilmsManager manager = new FilmsManager();

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");
        manager.addFilm("4");

        String[] actual = manager.findLast();
        String[] expected = {"4", "3", "2", "1"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastOverLimitDefault() { //Вывод всех добавленных фильмов в обратном порядке (граничные значения)

        FilmsManager manager = new FilmsManager();

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");
        manager.addFilm("4");
        manager.addFilm("5");
        manager.addFilm("6");

        String[] actual = manager.findLast();
        String[] expected = {"6", "5", "4", "3", "2"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastLimitDefault() { //Вывод всех добавленных фильмов в обратном порядке (граничные значения)

        FilmsManager manager = new FilmsManager();

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");
        manager.addFilm("4");
        manager.addFilm("5");

        String[] actual = manager.findLast();
        String[] expected = {"5", "4", "3", "2", "1"};

        Assertions.assertArrayEquals(actual, expected);
    }

    //Лимит фильмов, установле вручную - 4 (граничное значение)
    @Test
    public void findAllFilmsFourWhenLimitIsFour() { // Вывод 4-х фильмов при лимите 4 фильма (граничные значения)

        FilmsManager manager = new FilmsManager(4);

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");
        manager.addFilm("4");

        String[] actual = manager.findAll();
        String[] expected = {"1", "2", "3", "4"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findAllThreeFilmsWhenLimitIsFour() { // Вывод 3-х фильмов при лимите 4 фильма (граничные значения)

        FilmsManager manager = new FilmsManager(4);

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");


        String[] actual = manager.findAll();
        String[] expected = {"1", "2", "3"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findAllFiveFilmsWhenLimitIsFour() { // Добавление 5-ти фильмов при лимите 4 (граничные значения)

        FilmsManager manager = new FilmsManager(4);

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");
        manager.addFilm("4");
        manager.addFilm("5");

        String[] actual = manager.findAll();
        String[] expected = {"1", "2", "3", "4", "5"};

        Assertions.assertArrayEquals(actual, expected);
    }

    //Лимит фильмов, установле вручную - 6 (граничное значение)

    @Test
    public void findAllFiveFilmsWhenLimitIsSix() { // Добавление 5-ти фильмов при лимите 6 (граничные значения)

        FilmsManager manager = new FilmsManager(4);

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");
        manager.addFilm("4");
        manager.addFilm("5");

        String[] actual = manager.findAll();
        String[] expected = {"1", "2", "3", "4", "5"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findAllSixFilmsWhenLimitIsSix() { // Добавление 6-ти фильмов при лимите 6 (граничные значения)

        FilmsManager manager = new FilmsManager(4);

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");
        manager.addFilm("4");
        manager.addFilm("5");
        manager.addFilm("6");

        String[] actual = manager.findAll();
        String[] expected = {"1", "2", "3", "4", "5", "6"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findAllSevenFilmsWhenLimitIsSix() { // Добавление 7-ми фильмов при лимите 6 (граничные значения)

        FilmsManager manager = new FilmsManager(4);

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");
        manager.addFilm("4");
        manager.addFilm("5");
        manager.addFilm("6");
        manager.addFilm("7");

        String[] actual = manager.findAll();
        String[] expected = {"1", "2", "3", "4", "5", "6", "7"};

        Assertions.assertArrayEquals(actual, expected);
    }

}
