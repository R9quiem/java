package main;

class Animal {
    void voice() { System.out.println("Животное говорит...");}
    void voice(String s) {System.out.println("Животное говорит " + s);}
}

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.voice();
        animal.voice("гав");
    }
}
