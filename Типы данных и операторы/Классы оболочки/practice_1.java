package org.example;

public class Main {
    public static void main(String[] args) {
        Integer a = Integer.decode("123");   // десятичное
        Integer b = Integer.decode("0x7B");  // шестнадцатеричное
        System.out.println(a + ", " + b); // 123, 123
    }
}

