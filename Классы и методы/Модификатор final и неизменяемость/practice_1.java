class A1 {
    public final int a = 10;
}
class A2 {
    public final int a;

    public A2(int value) {
        a = value;
    }
}

//блок инициализации
class A3 {
    public final int a;

    {
        a = 7; // выполняется перед конструктором
    }
}
