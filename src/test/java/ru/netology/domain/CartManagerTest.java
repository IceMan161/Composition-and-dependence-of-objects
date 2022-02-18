package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartManagerTest {

    @Test
    public void shouldAdd() {
        CartManager manager = new CartManager();

        PurchaseFilm first = new PurchaseFilm(1, "Avengers");
        PurchaseFilm second = new PurchaseFilm(2, "Iron man");
        PurchaseFilm third = new PurchaseFilm(3, "Avatar");
        PurchaseFilm fourth = new PurchaseFilm(4, "Terminator");
        PurchaseFilm fifth = new PurchaseFilm(5, "Thor");
        PurchaseFilm sixth = new PurchaseFilm(6, "Hulk");
        PurchaseFilm seventh = new PurchaseFilm(7, "Black Panther");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        PurchaseFilm[] actual = manager.getAll();
        PurchaseFilm[] expected = new PurchaseFilm[]{seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldOutputOfAllMoviesInTheOrderOfAddition() {

        CartManager manager = new CartManager();

        PurchaseFilm first = new PurchaseFilm(1, "Avengers");
        PurchaseFilm second = new PurchaseFilm(2, "Iron man");
        PurchaseFilm third = new PurchaseFilm(3, "Avatar");
        PurchaseFilm fourth = new PurchaseFilm(4, "Terminator");
        PurchaseFilm fifth = new PurchaseFilm(5, "Thor");
        PurchaseFilm sixth = new PurchaseFilm(6, "Hulk");
        PurchaseFilm seventh = new PurchaseFilm(7, "Black Panther");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        PurchaseFilm[] actual = manager.findAll();
        PurchaseFilm[] expected = new PurchaseFilm[]{first, second, third, fourth, fifth, sixth, seventh};
        assertArrayEquals(actual, expected);

    }

    @Test

    public void shouldFindLast() {

        CartManager manager = new CartManager(5);

        PurchaseFilm first = new PurchaseFilm(1, "Avengers");
        PurchaseFilm second = new PurchaseFilm(2, "Iron man");
        PurchaseFilm third = new PurchaseFilm(3, "Avatar");
        PurchaseFilm fourth = new PurchaseFilm(4, "Terminator");
        PurchaseFilm fifth = new PurchaseFilm(5, "Thor");
        PurchaseFilm sixth = new PurchaseFilm(6, "Hulk");
        PurchaseFilm seventh = new PurchaseFilm(7, "Black Panther");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        PurchaseFilm[] actual = manager.findLast();
        PurchaseFilm[] expected = new PurchaseFilm[]{seventh, sixth, fifth, fourth, third};
        assertArrayEquals(actual, expected);

    }

    @Test
    public void shouldFindLastNoParam() {

        CartManager manager = new CartManager();

        PurchaseFilm first = new PurchaseFilm(1, "Avengers");
        PurchaseFilm second = new PurchaseFilm(2, "Iron man");
        PurchaseFilm third = new PurchaseFilm(3, "Avatar");
        PurchaseFilm fourth = new PurchaseFilm(4, "Terminator");
        PurchaseFilm fifth = new PurchaseFilm(5, "Thor");
        PurchaseFilm sixth = new PurchaseFilm(6, "Hulk");
        PurchaseFilm seventh = new PurchaseFilm(7, "Black Panther");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        PurchaseFilm[] actual = manager.findLast();
        PurchaseFilm[] expected = new PurchaseFilm[]{seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(actual, expected);

    }
}