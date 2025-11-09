package main;

class A {
    int value;
    A(int value) {
        this.value = value;
    }
    void printValue() {System.out.println(value);}
}

class B extends A {
    B(int value) {
        super(value); //конструктор суперкласса
    }
    void printValue() {
        super.value = - super.value; //поле суперкласса
        super.printValue(); //метод супер класса
    }
}

public class Main {
    public static void main(String[] args) {
        B b = new B(5);
        b.printValue();
    }
}
