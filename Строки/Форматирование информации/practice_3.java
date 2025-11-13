package main;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();

        System.out.printf("Часы (24-формат): %tH%n", now);        // %tH
        System.out.printf("Минуты: %tM%n", now);                   // %tM
        System.out.printf("Секунды: %tS%n", now);                  // %tS
        System.out.printf("Год (4 цифры): %tY%n", now);            // %tY
        System.out.printf("Полное название месяца: %tB%n", now);   // %tB
    }
}

