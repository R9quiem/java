package main;

class Animal {
    void voice() { System.out.println("Животное говорит...");}
}

class Dog extends Animal {
    @Override
    void Voice() {System.out.println("Собака гавкает...");} //компилятор выдает ошибку: java: method does not override or implement a method from a supertype
}
public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();

        animal.voice();
        dog.voice();
    }
}
