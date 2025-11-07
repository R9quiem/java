package util;

public class A {
    public int a = 1;       // видно везде
    protected int b = 2;    // видно в том же пакете и у наследников
    int c = 3;     // package-private (нет модификатора)
    private int d = 4;      // видно только внутри этого класса

    public void show() {
        System.out.println("Внутри A: " + a + " " + b + " " + c + " " + d);
    }
}