package main;

//Интерфейс AutoCloseable нужен для того, чтобы объект можно было автоматически закрыть после использования — без явного вызова close().
//Он используется в конструкции try-with-resources.

class MyResource implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Ресурс закрыт!");
    }

    void work() {
        System.out.println("Работа ресурса...");
    }
}

public class Main {
    public static void main(String[] args) {
        try (MyResource r = new MyResource()) {
            r.work();
        }
    }
}

/*Вывод:
Работа ресурса...
Ресурс закрыт!
*/
