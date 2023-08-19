import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {


    //findAll
    @Test
    public void shouldBeEmpty() { //Вызов пустой афиши

        FilmsManager manager = new FilmsManager();

        String[] actual = manager.findAll();
        String[] expected = {};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findAllOneFilm() { //Вывод одного фильма

        FilmsManager manager = new FilmsManager();

        manager.addFilm("1");

        String[] actual = manager.findAll();
        String[] expected = {"1"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findAllFourFilms() { //Добавление некоторого количества фильмов

        FilmsManager manager = new FilmsManager();

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");
        manager.addFilm("4");

        String[] actual = manager.findAll();
        String[] expected = {"1", "2", "3", "4"};

        Assertions.assertArrayEquals(actual, expected);
    }



    //findLast
    //не указываем лимит (по умолчанию равен 5)
    @Test
    public void findLastFourFilmsLimitDefault() { //Добавление 4-х фильмов без указания лимита (граничное значение)

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
    public void findLastFiveFilmsLimitDefault() { //Добавление 5-ти фильмов без указания лимита (граничное значение)

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

    @Test
    public void findLastSixFilmsLimitDefault() { //Добавление 6-ти фильмов без указания лимита (граничное значение)

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
    public void findLastTenFilmsLimitDefault() { //Добавление 10-ти фильмов без указания лимита

        FilmsManager manager = new FilmsManager();

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");
        manager.addFilm("4");
        manager.addFilm("5");
        manager.addFilm("6");
        manager.addFilm("7");
        manager.addFilm("8");
        manager.addFilm("9");
        manager.addFilm("10");

        String[] actual = manager.findLast();
        String[] expected = {"10", "9", "8", "7", "6"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastNoFilmsLimitDefault() { //Пустая афиша без указания лимита

        FilmsManager manager = new FilmsManager();

        String[] actual = manager.findLast();
        String[] expected = {};

        Assertions.assertArrayEquals(actual, expected);
    }

    //установлен лимит - 4 фильма
    @Test
    public void findLastNoFilmsLimitFour() { //Пустая афиша

        FilmsManager manager = new FilmsManager(4);

        String[] actual = manager.findLast();
        String[] expected = {};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastTenFilmsLimitFour() { //Добавляем 10 фильмов

        FilmsManager manager = new FilmsManager(4);

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");
        manager.addFilm("4");
        manager.addFilm("5");
        manager.addFilm("6");
        manager.addFilm("7");
        manager.addFilm("8");
        manager.addFilm("9");
        manager.addFilm("10");


        String[] actual = manager.findLast();
        String[] expected = {"10", "9", "8", "7"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastFourFilmsLimitFour() { //Добавляем 4 фильма (граничное значение)

        FilmsManager manager = new FilmsManager(4);

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");
        manager.addFilm("4");

        String[] actual = manager.findLast();
        String[] expected = {"4", "3", "2", "1"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastFiveFilmsLimitFour() { //Добавляем 5 фильмов (граничное значение)

        FilmsManager manager = new FilmsManager(4);

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");
        manager.addFilm("4");
        manager.addFilm("5");

        String[] actual = manager.findLast();
        String[] expected = {"5", "4", "3", "2"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastThreeFilmsLimitFour() { //Добавляем 3 фильма (граничное значение)

        FilmsManager manager = new FilmsManager(4);

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");


        String[] actual = manager.findLast();
        String[] expected = {"3", "2", "1"};

        Assertions.assertArrayEquals(actual, expected);
    }

    //лимит - 5 фильмов
    @Test
    public void findLastNoFilmsLimitFive() { //Ни один фильм не добавляем

        FilmsManager manager = new FilmsManager(5);

        String[] actual = manager.findLast();
        String[] expected = {};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastTenFilmsLimitFive() { //Добавляем 10 фильмов

        FilmsManager manager = new FilmsManager(5);

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");
        manager.addFilm("4");
        manager.addFilm("5");
        manager.addFilm("6");
        manager.addFilm("7");
        manager.addFilm("8");
        manager.addFilm("9");
        manager.addFilm("10");


        String[] actual = manager.findLast();
        String[] expected = {"10", "9", "8", "7", "6"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastFourFilmsLimitFive() { //Добавляем 4 фильма (граничное значение)

        FilmsManager manager = new FilmsManager(5);

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");
        manager.addFilm("4");

        String[] actual = manager.findLast();
        String[] expected = {"4", "3", "2", "1"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastFiveFilmsLimitFive() { //Добавляем 5 фильмов (граничное значение)

        FilmsManager manager = new FilmsManager(5);

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");
        manager.addFilm("4");
        manager.addFilm("5");

        String[] actual = manager.findLast();
        String[] expected = {"5", "4", "3", "2", "1"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastThreeFilmsLimitFive() { //Добавляем 6 фильмов (граничное значение)

        FilmsManager manager = new FilmsManager(5);

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

    //лимит - 6 фильмов
    @Test
    public void findLastNoFilmsLimitSix() { //Ни один фильм не добавляем

        FilmsManager manager = new FilmsManager(6);

        String[] actual = manager.findLast();
        String[] expected = {};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastTenFilmsLimitSix() { //Добавляем 10 фильмов

        FilmsManager manager = new FilmsManager(6);

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");
        manager.addFilm("4");
        manager.addFilm("5");
        manager.addFilm("6");
        manager.addFilm("7");
        manager.addFilm("8");
        manager.addFilm("9");
        manager.addFilm("10");


        String[] actual = manager.findLast();
        String[] expected = {"10", "9", "8", "7", "6", "5"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastSevenFilmsLimitSix() { //Добавляем 7 фильмов (граничное значение)

        FilmsManager manager = new FilmsManager(6);

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");
        manager.addFilm("4");
        manager.addFilm("5");
        manager.addFilm("6");
        manager.addFilm("7");

        String[] actual = manager.findLast();
        String[] expected = {"7", "6", "5", "4", "3", "2"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastFiveFilmsLimitSix() { //Добавляем 5 фильмов (граничное значение)

        FilmsManager manager = new FilmsManager(6);

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");
        manager.addFilm("4");
        manager.addFilm("5");

        String[] actual = manager.findLast();
        String[] expected = {"5", "4", "3", "2", "1"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastThreeFilmsLimitSix() { //Добавляем 6 фильмов (граничное значение)

        FilmsManager manager = new FilmsManager(6);

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");
        manager.addFilm("4");
        manager.addFilm("5");
        manager.addFilm("6");


        String[] actual = manager.findLast();
        String[] expected = {"6", "5", "4", "3", "2", "1"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastNegativeLimitFilms() { //устанавливаем отрицательный лимит в менеджере

        FilmsManager manager = new FilmsManager(- 6);

        String[] actual = manager.findLast();
        String[] expected = {};

        Assertions.assertArrayEquals(actual, expected);
    }


    // Нулевой лимит в менеджере
    @Test
    public void findLastEmptyLimitFilms() {
        FilmsManager manager = new FilmsManager(0);

        String[] actual = manager.findLast();
        String[] expected = {};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastEmptyLimitFilmsAddOneFilms() { //добавляем один фильм (ожидаем пустой массив)
        FilmsManager manager = new FilmsManager(0);

        manager.addFilm("1");

        String[] actual = manager.findLast();
        String[] expected = {};

        Assertions.assertArrayEquals(actual, expected);
    }

}
