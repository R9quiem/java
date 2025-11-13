package main;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Пробуем деление...");
            int result = 10 / 0; // Генерируется ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Перехвачено исключение: " + e);
        }

        System.out.println("Продолжаем выполнение...");

        // Второе исключение, НЕ перехваченное
        String text = null;
        System.out.println(text.length()); // Генерирует NullPointerException
        // и аварийно завершает программу
    }
}

