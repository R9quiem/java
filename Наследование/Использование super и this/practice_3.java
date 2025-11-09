class A {
    int a;
    int b;
    int c;
    int z;

    public A() {
        z = 1;
    }

    public A(int a) {
        this();           // вызываем конструктор без параметров
        this.a = a;
    }

    public A(int a, int b) {
        this(a);           // вызываем конструктор с одним параметром
        this.b = b;
    }

    public A(int a, int b, int c) {
        this(a, b);        // вызываем конструктор с двумя параметрами
        this.c = c;
    }
}
