package sample4;

public class Human extends Animal {

    private String name;

    Human(String name) {
        super("人間");
        this.name = name;
    }

    public void sayName() {
        System.out.println(String.format("私の名前は%sです", name));
    }
}
