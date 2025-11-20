package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("data.txt")) {

            int b;
            while ((b = is.read()) != -1) {   // читаем по одному байту
                System.out.println("Прочитано: " + b +
                        " символ: " + (char) b);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*Если в файле data.txt например находится ABC, то выведет:
Прочитано: 65 символ: A
Прочитано: 66 символ: B
Прочитано: 67 символ: C
*/
