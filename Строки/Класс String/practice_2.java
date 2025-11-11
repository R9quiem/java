package main;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        joiner.add("Java");
        joiner.add("Python");
        joiner.add("C++");
        System.out.println(joiner); // -> [Java, Python, C++]
    }
}
