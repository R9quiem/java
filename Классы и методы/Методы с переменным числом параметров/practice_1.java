package main;

class VarargsExample {

    // Метод с одним параметром
    public void printValues(int a) {
        System.out.println("Один параметр: " + a);
    }

    // Метод с переменным числом параметров
    public void printValues(int... numbers) {
        System.out.print("Несколько параметров: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        VarargsExample ex = new VarargsExample();

        ex.printValues(5);          // вызовет метод с одним параметром
        ex.printValues(1, 2, 3, 4); // вызовет метод с varargs
    }
}

public class Main {
    public static void main(String[] args) {
        VarargsExample ex = new VarargsExample();

        ex.printValues(5);          // вызовет метод с одним параметром
        ex.printValues(1, 2, 3, 4); // вызовет метод с varargs
    }
}

