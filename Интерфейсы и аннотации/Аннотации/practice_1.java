package main;

import java.util.ArrayList;
import java.util.List;

class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override // Проверяет переопределение метода
    public void makeSound() {
        System.out.println("Bark!");
    }
}

class MathUtils {

    @Deprecated(since = "1.5", forRemoval = true) //Помечает элемент как устаревший
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    @SuppressWarnings("unchecked, rawtypes") // Подавляет выбранные предупреждения
    public static void main(String[] args) {
        int result = MathUtils.sum(5, 10);  // Предупреждение: метод устарел
        System.out.println(result);

        List list = new ArrayList(); // "raw type" предупреждение
        list.add("Java");
        List<String> safeList = list; //  тип не проверяется

    }
}
