import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void showFindAll() {
        PosterManager manager = new PosterManager();

        manager.add("Bloodshot");
        manager.add("Forward");
        manager.add("Hotel Belgrade");
        manager.add("Gentlemen");
        manager.add("Man is invisible");
        manager.add("Trolls. world tour");
        manager.add("Number one");

        String[] expected = {"Bloodshot", "Forward", "Hotel Belgrade", "Gentlemen", "Man is invisible", "Trolls. world tour", "Number one"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void showFindLast() {
        PosterManager manager = new PosterManager(10);

        manager.add("Bloodshot");
        manager.add("Forward");
        manager.add("Hotel Belgrade");
        manager.add("Gentlemen");
        manager.add("Man is invisible");
        manager.add("Trolls. world tour");
        manager.add("Number one");


        String[] expected = {"Bloodshot", "Forward", "Hotel Belgrade", "Gentlemen", "Man is invisible", "Trolls. world tour", "Number one"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void showFindLastAbove() {
        PosterManager manager = new PosterManager(7);

        manager.add("Bloodshot");
        manager.add("Forward");
        manager.add("Hotel Belgrade");
        manager.add("Gentlemen");
        manager.add("Man is invisible");
        manager.add("Trolls. world tour");
        manager.add("Number one");


        String[] expected = {"Bloodshot", "Forward", "Hotel Belgrade", "Gentlemen", "Man is invisible", "Trolls. world tour", "Number one"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
}