package main;


interface A {
    default void show() {
        System.out.println("Интерфейс A");
    }
}

interface B {
    default void show() {
        System.out.println("Интерфейс B");
    }
}

class C implements A, B { //ошибка компилятора class C inherits unrelated defaults for show() from types A and B
    //То есть java не знает, какую реализацию использовать (A.show() или B.show()).
}


public class Main {
    public static void main(String[] args) {

    }
}
