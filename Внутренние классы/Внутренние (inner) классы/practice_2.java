package main;

class Outer {
    private int x = 10;
    String pkg = "pkg";
    protected int prot = 20;
    public int pub = 30;

    private void secret() { System.out.println("secret"); }
    void def() { System.out.println("def"); }
    protected void p() { System.out.println("p"); }
    public void g() { System.out.println("g"); }

    public class Inner {
        public void demo() {
            // Доступ к полям любого модификатора
            System.out.println(x + ", " + pkg + ", " + prot + ", " + pub);
            // Доступ к методам любого модификатора
            secret(); def(); p(); g();
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner in = o.new Inner(); // нужен экземпляр внешнего
        in.demo(); //Модификаторы доступа внешнего класса не ограничивают inner-класс: он видит даже private.
    }
}
