package at.campus02.hoelbling;

public class Animal {

    private String name;
    private int age;
    private String species;
    private String animalLoud;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
        giveAnimalLoud();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getAnimalLoud() {
        return animalLoud;
    }

    public void setAnimalLoud(String animalLoud) {
        this.animalLoud = animalLoud;
    }

    public String getNameAndAge() {
        return (getName() + " (" + getAge() + ")");
    }

    public String giveAnimalLoud() {
        switch (getSpecies()) {
            case "Loewe":
                setAnimalLoud("Roarr");
                return getAnimalLoud();
            case "Hund":
                setAnimalLoud("Wuff");
                return getAnimalLoud();
            case "Katze":
                setAnimalLoud("Miau");
                return getAnimalLoud();
            default:
                return null;
        }
    }

    public String ageCategory() {
        if (getAge() <= 2) {
            return  "baby animal";
        } else if (getAge() <= 4) {
            return "young animal";
        } else {
            return "old anmimal";
        }
    }
}
