package main;

class A {
    final void f() {System.out.println("Parent");}
}

class B extends A {
    void f() {System.out.println("Child");} //Компилятор выдает ошибку - overridden method is final
}

public class Main {

    public static void main(String[] args) {

    }
}
