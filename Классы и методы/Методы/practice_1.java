package main;

class MathUtils {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Animal {
    void sound() {
        System.out.println("Животное издаёт звук");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Собака лает");
    }
}

public class Main {
    public static void main(String[] args) {
        MathUtils m = new MathUtils();
        System.out.println(m.add(2, 3));       // 5
        System.out.println(m.add(2.5, 3.5));   // 6.0

        Animal a = new Animal();
        Animal d = new Dog();
        a.sound(); // Животное издаёт звук
        d.sound(); // Собака лает
    }
}
