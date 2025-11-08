package main;

class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class Main extends A {
    public static void main(String[] args) {
        A.printVars();

        A a = new A();
        a.printVars(); //не рекомендуется

        A obj = null;
        obj.printVars();

        printVars(); //так как Main наследуется от A
    }
}

