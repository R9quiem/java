package main;

import java.util.ArrayList;
import java.util.List;

class Box<T> {
    private T value;
    public Box(T value) { this.value = value; }
    public T getValue() { return value; }
}

public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(10);
        Box<String> strBox = new Box<>("Hello");

        // Проверка типа самого класса (а не параметра)
        if (intBox instanceof Box) {
            System.out.println("intBox — это объект Box");
        }

        if (strBox instanceof Box<?>) {
            System.out.println("strBox — это объект Box<?> ");
        }


        if (intBox instanceof Box<Integer>) { }
        if (strBox instanceof Box<Integer>) { } //Ошибка
    }
}
