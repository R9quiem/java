package main;

class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

public class Main {
    public static void main(String[] args) {
        //несколько исключений обрабатываются абсолютно идентичным образом;
        try {
            int[] arr = new int[3];
            arr[5] = 10;
            int x = 10 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Произошла ошибка: " + e);
        }
        try {
            throw new Ex3();   // генерируем исключение самого нижнего уровня
        } catch (Ex3 e) {
            System.out.println("Перехват Ex3");
        } catch (Ex2 e) {
            System.out.println("Перехват Ex2");
        } catch (Ex1 e) {
            System.out.println("Перехват Ex1");
        }
    }
}

