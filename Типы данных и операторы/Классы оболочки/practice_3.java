package org.example;

public class Main {
    public static void main(String[] args) {
        Integer num = null;   // объект-обёртка с null
        int value = num;      // попытка автораспаковки
        System.out.println(value); //выбрасывает NullPointerException
    }
}

