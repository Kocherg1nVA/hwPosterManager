package ru.netology;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void shouldFindAll() {
        PosterManager manager = new PosterManager();
        manager.addMovie("Hellboy");
        manager.addMovie("Deadpool");
        manager.addMovie("Alien");
        String[] expected = {"Hellboy", "Deadpool", "Alien"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast(){
        PosterManager manager = new PosterManager();
        manager.addMovie("Hellboy");
        manager.addMovie("Deadpool");
        manager.addMovie("Alien");
        manager.findLast();
        String[] expected = {"Alien", "Deadpool", "Hellboy"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfMoreThenFive(){
        PosterManager manager = new PosterManager(6);
        manager.addMovie("Despicable Me 4");
        manager.addMovie("Wicked");
        manager.addMovie("Moana 2");
        manager.addMovie("Beetlejuice Beetlejuice");
        manager.addMovie("Dune: Part Two");
        manager.addMovie("Twisters");
        String[] expected = {"Twisters", "Dune: Part Two", "Beetlejuice Beetlejuice", "Moana 2", "Wicked", "Despicable Me 4"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
