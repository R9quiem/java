import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите ваше имя");
        String name;
        Scanner scan = new Scanner(System.in);
        name = scan.next();
        System.out.println("Ваше имя: " + name);

    }
}
