package sample4;

public class Animal {
    protected String animalType;

    Animal(String animalType) {
        this.animalType = animalType;
    }

    public void sayAnimalType() {
        System.out.println(String.format("私は%sです。", animalType));
    }
}
