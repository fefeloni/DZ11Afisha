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
        PosterManager manager = new PosterManager(15);

        manager.add("Number one");
        manager.add("Trolls. world tour");
        manager.add("Man is invisible");
        manager.add("Gentlemen");
        manager.add("Hotel Belgrade");
        manager.add("Forward");
        manager.add("Bloodshot");


        String[] expected = {"Bloodshot", "Forward", "Hotel Belgrade", "Gentlemen", "Man is invisible", "Trolls. world tour", "Number one"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void showFindLastAbove() {
        PosterManager manager = new PosterManager(7);

        manager.add("Number one");
        manager.add("Trolls. world tour");
        manager.add("Man is invisible");
        manager.add("Gentlemen");
        manager.add("Hotel Belgrade");
        manager.add("Forward");
        manager.add("Bloodshot");


        String[] expected = {"Bloodshot", "Forward", "Hotel Belgrade", "Gentlemen", "Man is invisible", "Trolls. world tour", "Number one"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
}