package at.campus02.hoelbling;

public class Animal {

    private String name;
    private int age;
    private String species;
    private String animalLoud;

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

    private String giveAnimalLoud() {
        switch (getSpecies()) {
            case "Löwe":
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


}
