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
        animal1 = new Animal("Max", 2, "Loewe");
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

    @Test
    @DisplayName("Check getNameAndAge")
    void getNameAndAge() {
        assertEquals("Max (2)", animal1.getNameAndAge());
        assertEquals("Oskar (4)", animal2.getNameAndAge());
        assertEquals("Mia (5)", animal3.getNameAndAge());
    }

    @Test
    @DisplayName("Check ageCategory")
    void ageCategory() {
        assertEquals("baby animal", animal1.getAgeCategory());
        assertEquals("young animal", animal2.getAgeCategory());
        assertEquals("old anmimal", animal3.getAgeCategory());
    }

}