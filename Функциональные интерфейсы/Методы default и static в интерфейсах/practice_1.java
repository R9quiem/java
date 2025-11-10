package main;


interface Logger {
    default void log(String message) {
        System.out.println("Log: " + message);
    }

    static void printVersion() {
        System.out.println("Logger v1.0");
    }
}

class ConsoleLogger implements Logger {}

public class Main {
    public static void main(String[] args) {
        ConsoleLogger console = new ConsoleLogger();

        // Вызов default-метода через экземпляр
        console.log("Hello");  // Log: Hello

        // 2️Вызов static-метода интерфейса
        Logger.printVersion(); // Logger v1.0

        // 3️Вызов default-метода через ссылку интерфейса
        Logger logger = new ConsoleLogger();
        logger.log("Hi from interface reference!"); // Log: Hi from interface reference!

        // 4Нельзя вызвать static метод через объект
        // logger.printVersion(); // Ошибка компиляции
    }
}
