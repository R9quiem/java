package main;


public class Main {

    enum TrafficLight {
        RED(30),
        YELLOW(5),
        GREEN(25);

        private final int seconds; // длительность сигнала

        TrafficLight(int seconds) {
            this.seconds = seconds;
        }

        public int getSeconds() {
            return seconds;
        }

        // Дополнительный метод
        public String getAction() {
            return switch (this) {
                case RED -> "Стоп";
                case YELLOW -> "Жди";
                case GREEN -> "Иди";
            };
        }
    }

    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values()) {
            System.out.printf("%s — %s (время: %d сек.)%n",
                    light, light.getAction(), light.getSeconds());
        }
    }
}
