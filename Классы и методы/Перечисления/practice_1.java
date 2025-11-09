package main;


public class Main {
    // Перечисление с инициализацией элементов
    enum Season {
        WINTER("Зима", -10),
        SPRING("Весна", 10),
        SUMMER("Лето", 25),
        AUTUMN("Осень", 5);

        private final String name;   // название сезона
        private final int avgTemp;   // средняя температура

        // Конструктор перечисления
        Season(String name, int avgTemp) {
            this.name = name;
            this.avgTemp = avgTemp;
        }

        public String getName() {
            return name;
        }

        public int getAvgTemp() {
            return avgTemp;
        }
    }

    public static void main(String[] args) {
        for (Season s : Season.values()) {
            System.out.printf("%s — %s, средняя температура: %d°C%n",
                    s, s.getName(), s.getAvgTemp());
        }
    }
}

