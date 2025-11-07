package org.example;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Dog d1 = new Dog();
        Animal a2 = new Dog();
        Cat c1 = new Cat();
        String s = "Hello";
        Object obj = s;
        Animal aNull = null;

        System.out.println(a1 instanceof Animal); // true
        System.out.println(d1 instanceof Dog);    // true
        System.out.println(d1 instanceof Animal); // true
        System.out.println(a2 instanceof Dog);    // true (переменная типа Animal, но объект Dog)
        System.out.println(obj instanceof String); // true
        System.out.println(obj instanceof Object); // true

        // Проверка для null
        System.out.println(aNull instanceof Animal); // false
        System.out.println(aNull instanceof Object); // false
    }
}

