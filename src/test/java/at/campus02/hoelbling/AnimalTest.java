package at.campus02.hoelbling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    int a;
    Animal animal1;
    Animal animal2;
    Animal animal3;

    @BeforeEach
    void setUp() {
        a = 1;
        animal1 = new Animal("Max", 2, "Löwe");
        animal2 = new Animal("Oskar", 4, "Hund");
        animal3 = new Animal("Mia", 5, "Katze");
    }

    @Test
    @DisplayName("myFirstTest")
    void myFirstTest() {
        assertTrue(a > 0);
    }

    @Test
    @DisplayName("Check giveAnimalLoud")
    void giveAnimalLoud() {
        assertEquals("Roarr", animal1.getAnimalLoud());
        assertEquals("Wuff", animal2.getAnimalLoud());
        assertEquals("Miau", animal3.getAnimalLoud());
    }

}