package main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        try (OutputStream os = new FileOutputStream("out.bin")) {

            os.write(65);  // записываем байт 'A'
            os.write(66);  // записываем байт 'B'
            os.write(67);  // записываем байт 'C'

            System.out.println("Запись завершена!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
