package main;

public class Main {
    public static void main(String[] args) {
        boolean isJavaFun = true;
        char letter = 'J';
        int year = 2025;
        double pi = 3.1415926535;
        String language = "Java";

        // %b — логическое значение (boolean)
        System.out.printf("1. %b — Логическое значение: %b%n", isJavaFun, isJavaFun);

        // %c — символ (char)
        System.out.printf("2. %c — Символьное представление: %c%n", letter, letter);

        // %d — целое число (int, long)
        System.out.printf("3. %d — Десятичное целое число: %d%n", year, year);

        // %f — число с плавающей точкой (float, double)
        System.out.printf("4. %f — Число с плавающей точкой: %.2f%n", pi, pi);

        // %s — строка (String)
        System.out.printf("5. %s — Строковое представление: %s%n", language, language);
    }
}
