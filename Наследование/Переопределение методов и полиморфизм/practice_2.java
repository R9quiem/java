package main;

class Animal {
    void voice() { System.out.println("Животное говорит...");}
}

class Dog extends Animal {
    @Override
    void voice() {System.out.println("Собака гавкает...");}
}
class Cat extends Animal {
    @Override
    String voice() {System.out.println("Кошка гавкает..."); return "cat";} 
  //ошибка, получается так что метод не переопределяет метод из базового класса, у переопределяемого метода должен совпадать тип возвращаемого значения с
}
public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();

        animal.voice();
        dog.voice();
    }
}
