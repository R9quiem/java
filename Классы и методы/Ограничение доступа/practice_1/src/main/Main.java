package main;

import util.A;

class B extends A {
    int e = 5;
}

public class Main {
    public static void main(String[] args) {
        A obj = new A();
        obj.show(); // работает всегда — метод public

        System.out.println(obj.a); // ✅ public — видно
        //System.out.println(obj.b); // ❌ protected — не видно без наследования
        // System.out.println(obj.c); // ❌ package-private — другой пакет
        // System.out.println(obj.d); // ❌ private — закрыт

        B child = new B();
        System.out.println(child.e); // ✅ package-private — видно в текущем пакете
    }
}


