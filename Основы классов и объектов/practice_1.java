class Device {
    public void turnOn() {
        System.out.println("Device is on");
    }
}

class Printer extends Device {
    @Override
    public void turnOn() {
        System.out.println("Printer warming up");
    }

    public void print(String text) {
        System.out.println("Printing: " + text);
    }
}

public class Main {

    public static void startDevice(Device d) {
        System.out.println("Starting device...");
        d.turnOn(); // Вызов метода через базовый тип
    }

    public static void main(String[] args) {
        Device dev = new Device();
        Printer printer = new Printer();

        startDevice(dev);
        startDevice(printer);

    }
}
