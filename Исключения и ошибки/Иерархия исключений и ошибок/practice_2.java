package main;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // Генерируется ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Ошибка арифметики: " + e.getMessage());
        }

        try {
            int[] arr = {1, 2, 3};
            int value = arr[5]; // Генерируется ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Неверный индекс массива: " + e.getMessage());
        }

        try {
            setAge(-5); // Генерируется IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Неверный аргумент: " + e.getMessage());
        }

        try {
            Object obj = "Hello";
            Integer number = (Integer) obj; // Генерируется ClassCastException
        } catch (ClassCastException e) {
            System.out.println("Ошибка преобразования типов: " + e.getMessage());
        }

        try {
            String text = null;
            int length = text.length(); // Генерируется NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Обращение к null: " + e.getMessage());
        }
    }
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
    }
}

