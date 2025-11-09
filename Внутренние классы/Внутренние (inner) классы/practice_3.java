package main;

class Outer {
    public class Inner {
        private int privateField = 10;
        int defaultField = 20;
        protected int protectedField = 30;
        public int publicField = 40;

        private void privateMethod() {
            System.out.println("privateMethod()");
        }

        void defaultMethod() {
            System.out.println("defaultMethod()");
        }

        protected void protectedMethod() {
            System.out.println("protectedMethod()");
        }

        public void publicMethod() {
            System.out.println("publicMethod()");
        }
    }

    private class PrivateInner {
        void say() {
            System.out.println("Я private-внутренний класс");
        }
    }

    class DefaultInner {
        void say() {
            System.out.println("Я package-private внутренний класс");
        }
    }

    public void accessInner() {
        // создаём экземпляр внутреннего класса, связанный с этим Outer
        Inner inner = new Inner();

        //  Внешний класс имеет доступ ко ВСЕМ членам Inner
        System.out.println(inner.privateField);
        System.out.println(inner.defaultField);
        System.out.println(inner.protectedField);
        System.out.println(inner.publicField);

        inner.privateMethod();
        inner.defaultMethod();
        inner.protectedMethod();
        inner.publicMethod();

        new PrivateInner().say(); //  виден внутри Outer
        new DefaultInner().say(); //  виден внутри Outer
    }

}
public class Main {

    public static void main(String[] args) {
        Outer outer = new Outer();

        // outer.new PrivateInner(); //  ошибка: private — недоступен вне Outer
        Outer.DefaultInner inner = outer.new DefaultInner(); //  доступен в пакете
        inner.say();
    }
}
