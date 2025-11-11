package main;

public class Main {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "JAVA";

        s1.length(); // -> 4 - длина строки
        s1.charAt(1); // -> a - символ по индексу
        s1.equals(s2); // -> false - Сравнение содержимого
        s1.equalsIgnoreCase(s2); //-> true - Сравнение без учёта регистра
        "A".compareTo("B"); // -> -1 - Лексикографическое сравнение

        s1.concat(s2); // -> JavaJAVA - Объединяет строки
        s1.toUpperCase(); // ->JAVA - к верхнему регистру строку приводит
        System.out.println( s1.substring(1,4)); // -> ava - Извлекает подстроку
        s1.contains("a"); // -> true - Проверяет наличие подстроки
        " space   ".trim(); // -> "space" - Убирает пробелы по краям
    }
}
