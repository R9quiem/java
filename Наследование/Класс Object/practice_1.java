class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        // Проверка на ссылку (один и тот же объект)
        if (this == obj)
            return true;

        // Проверка на null и тип
        if (obj == null || getClass() != obj.getClass())
            return false;

        // Приведение типа
        Person other = (Person) obj;

        // Сравнение содержимого
        return age == other.age && Objects.equals(name, other.name);
    }
}
