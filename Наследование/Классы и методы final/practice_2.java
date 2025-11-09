package main;


final class A {
    final void f() {System.out.println("Parent");}
}

class B extends A { // Ошибка: Cannot inherit from final 'main.A'

}

public class Main {

    public static void main(String[] args) {

    }
}
