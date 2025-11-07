package org.example;

public class Main {
    public static void main(String[] args) {
        //byte, short, char, int - целочисленные типы
        //их обёртки: Byte, Short, Character, Integer
        //enum (перечисления)
        //String (начиная с Java 7)	Переключение по строковым значениям
        int n = 2;
        switch (n) {
            case 1: System.out.println("one"); break;
            case 2: System.out.println("two"); break;
            default: System.out.println("other");
        }

        char ch = 'b';
        switch (ch) {
            case 'a': System.out.println("A"); break;
            case 'b': System.out.println("B"); break;
            default: System.out.println("?");
        }

        byte b = 10;
        switch (b) {
            case 5: System.out.println("five"); break;
            case 10: System.out.println("ten"); break;
        }

        short s = 100;
        switch (s) {
            case 50: System.out.println("fifty"); break;
            case 100: System.out.println("hundred"); break;
        }

        Integer num = 3;
        switch (num) {
            case 1: System.out.println("one"); break;
            case 3: System.out.println("three"); break;
        }

        enum Day { MON, TUE, WED }

        Day d = Day.TUE;
        switch (d) {
            case MON: System.out.println("Monday"); break;
            case TUE: System.out.println("Tuesday"); break;
            case WED: System.out.println("Wednesday"); break;
        }

        String color = "red";
        switch (color) {
            case "red": System.out.println("Красный"); break;
            case "blue": System.out.println("Синий"); break;
            default: System.out.println("Другой цвет");
        }
    }
}

