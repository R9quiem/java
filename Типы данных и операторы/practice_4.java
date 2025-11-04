package org.example;

class Car {
    String model;
    Car(String model) {
        this.model=model;
    }

    @Override
    public String toString() {
        return model;
    }
}

public class Main {

    public static void main(String[] args) {
        String name = "Efim ";
        int age = 22;
        System.out.println("String + int: " + name + age);

        Car car = new Car("Toyota");
        String message = "String + object: Моя машина: " + car;
        System.out.println(message);
    }
}
