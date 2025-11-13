package main;

// Собственное проверяемое исключение
class InvalidAgeException extends Exception {

    // Конструктор без сообщения
    public InvalidAgeException() {
        super();
    }

    // Конструктор с сообщением
    public InvalidAgeException(String message) {
        super(message);
    }

    // Конструктор с сообщением и причиной
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    // Конструктор с причиной
    public InvalidAgeException(Throwable cause) {
        super(cause);
    }
}

class Person {
    public void setAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Возраст не может быть отрицательным: " + age);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        try {
            p.setAge(-10);
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
