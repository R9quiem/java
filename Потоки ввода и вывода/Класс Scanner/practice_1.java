package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");   // Путь к файлу
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close(); // Закрываем сканер
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
    }
}
