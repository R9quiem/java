package main;

class Outer {

    public class PublicInner {
        public void show() { System.out.println("PublicInner доступен везде"); }
    }

    protected class ProtectedInner {
        public void show() { System.out.println("ProtectedInner доступен в пакете и наследниках"); }
    }

    class DefaultInner {
        public void show() { System.out.println("DefaultInner доступен только в этом пакете"); }
    }

    private class PrivateInner {
        public void show() { System.out.println("PrivateInner доступен только внутри Outer"); }
    }

    public void accessInnerClasses() {
        // Внешний класс имеет доступ ко всем внутренним
        new PublicInner().show(); //доступен везде
        new ProtectedInner().show(); // доступен в пакете и наследниках
        new DefaultInner().show(); // доступен только в этом пакете
        new PrivateInner().show(); // доступен только внутри Outer
    }
}


public class Main {

    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.PublicInner pub = outer.new PublicInner(); // Доступен
        Outer.ProtectedInner prot = outer.new ProtectedInner(); // Доступен (в одном пакете)
        Outer.DefaultInner def = outer.new DefaultInner(); // Доступен (package-private)
        // Outer.PrivateInner priv = outer.new PrivateInner(); // Ошибка: private недоступен
    }
}
