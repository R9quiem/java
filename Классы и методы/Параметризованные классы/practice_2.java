package main;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<? extends Number> list = List.of(1, 2.0);
        Number n = list.get(0); // можно читать

        List<? super Integer> list2 = new ArrayList<Number>();
        list2.add(10); // можно добавлять
    }
}

