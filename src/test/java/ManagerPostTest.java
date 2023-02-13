import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerPostTest {

    @Test
    public void testGetAll() {
        ManagerPost manager = new ManagerPost();

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
        ManagerPost manager = new ManagerPost();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddOneFilm() {
        ManagerPost manager = new ManagerPost();

        manager.addFilm("film 1");

        String[] expected = {"film 1",};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddSevenFilm() {
        ManagerPost manager = new ManagerPost();

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
        ManagerPost manager = new ManagerPost();

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
        ManagerPost manager = new ManagerPost();

        manager.addFilm("film 1");
        manager.addFilm("film 2");
        manager.addFilm("film 3");
        manager.addFilm("film 4");
        manager.addFilm("film 5");

        String[] expected = {"film 5", "film 4", "film 3", "film 2", "film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
