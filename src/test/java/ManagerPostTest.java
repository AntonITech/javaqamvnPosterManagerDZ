import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManagerPostTest {

    ManagerPost manager = new ManagerPost();

    @Test
    public void testGetAll() {

        manager.addFilm("film 1");
        manager.addFilm("film 2");
        manager.addFilm("film 3");
        manager.addFilm("film 4");
        manager.addFilm("film 5");
        manager.addFilm("film 6");
        manager.addFilm("film 7");
        manager.addFilm("film 8");
        manager.addFilm("film 9");
        manager.addFilm("film 10");

        String[] expected = {"film 1", "film 2", "film 3", "film 4", "film 5", "film 6", "film 7", "film 8", "film 9", "film 10"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetNotAddFilm() {

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddOneFilm() {

        manager.addFilm("film 1");

        String[] expected = {"film 1",};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddSevenFilm() {

        manager.addFilm("film 1");
        manager.addFilm("film 2");
        manager.addFilm("film 3");
        manager.addFilm("film 4");
        manager.addFilm("film 5");
        manager.addFilm("film 6");
        manager.addFilm("film 7");

        String[] expected = {"film 1", "film 2", "film 3", "film 4", "film 5", "film 6", "film 7"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetReversAllFilms() {

        manager.addFilm("film 1");
        manager.addFilm("film 2");
        manager.addFilm("film 3");
        manager.addFilm("film 4");
        manager.addFilm("film 5");
        manager.addFilm("film 6");
        manager.addFilm("film 7");
        manager.addFilm("film 8");
        manager.addFilm("film 9");
        manager.addFilm("film 10");

        String[] expected = {"film 10", "film 9", "film 8", "film 7", "film 6", "film 5", "film 4", "film 3", "film 2", "film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetLastFiveFilmsRevers() {

        manager.addFilm("film 1");
        manager.addFilm("film 2");
        manager.addFilm("film 3");
        manager.addFilm("film 4");
        manager.addFilm("film 5");

        String[] expected = {"film 5", "film 4", "film 3", "film 2", "film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetLastAllFilms() {

        manager.addFilm("film 1");
        manager.addFilm("film 2");
        manager.addFilm("film 3");
        manager.addFilm("film 4");
        manager.addFilm("film 5");                 //ДОБАВЛЯЕТ БОЛЬШЕ ЛИМИТА
        manager.addFilm("film 6");
        manager.addFilm("film 7");
        manager.addFilm("film 8");
        manager.addFilm("film 9");
        manager.addFilm("film 10");
        manager.addFilm("film 11");

        String[] expected = {"film 10", "film 9", "film 8", "film 7", "film 6", "film 5", "film 4", "film 3", "film 2", "film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetLastFilmsMinLimit() {

        manager.addFilm("film 7");
        manager.addFilm("film 8");
        manager.addFilm("film 9");
        manager.addFilm("film 10");

        String[] expected = {"film 10", "film 9", "film 8", "film 7"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
