package main;

interface Printer {

    // Вложенный класс
    static class Helper { //static вообще я так понимаю не обязателен, когда у нас вложенный класс в интерфейсе.
        public void printMessage(String msg) {
            System.out.println("Сообщение: " + msg);
        }
    }

    void print(String msg);
}

class ConsolePrinter implements Printer {
    @Override
    public void print(String msg) {
        System.out.println("Печать: " + msg);
    }
}

public class Main {

    public static void main(String[] args) {
        // Используем вложенный класс из интерфейса
        Printer.Helper helper = new Printer.Helper();
        helper.printMessage("Привет из вложенного класса!");

        // Используем реализацию интерфейса
        Printer printer = new ConsolePrinter();
        printer.print("Привет из реализации интерфейса!");
    }
}
