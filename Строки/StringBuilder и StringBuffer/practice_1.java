package main;


public class Main {
    public static void main(String[] args) {

        // Конструкторы
        StringBuilder sb = new StringBuilder("Java"); //конструктор
        StringBuffer sbf = new StringBuffer("Programming"); //конструктор

        //  ️append() — добавляет текст в конец строки
        sb.append(" Language");
        System.out.println("append(): " + sb); // Java Language

        // insert() — вставляет текст по указанной позиции
        sb.insert(4, " SE");
        System.out.println("insert(): " + sb); // Java SE Language

        // replace() — заменяет часть текста (от start до end)
        sb.replace(5, 7, "11");
        System.out.println("replace(): " + sb); // Java 11 Language

        // delete() — удаляет часть текста
        sb.delete(5, 8);
        System.out.println("delete(): " + sb); // Java Language

        // reverse() — переворачивает строку
        sb.reverse();
        System.out.println("reverse(): " + sb); // egaugnaL avaJ

        // length() — возвращает длину строки
        System.out.println("length(): " + sb.length()); // длина строки

        // capacity() — показывает ёмкость буфера (резерв памяти)
        System.out.println("capacity(): " + sb.capacity());

        // setCharAt() — изменяет символ по индексу
        sb.reverse(); // вернём строку обратно
        sb.setCharAt(0, 'j');
        System.out.println("setCharAt(): " + sb); // java Language

        // toString() — превращает StringBuilder/StringBuffer в обычный String
        String result = sb.toString();
        System.out.println("toString(): " + result);

        // Пример с StringBuffer (методы аналогичны)
        sbf.append(" is fun!");
        sbf.delete(0, 6);
        System.out.println("StringBuffer example: " + sbf);
    }
}
