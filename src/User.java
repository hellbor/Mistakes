public class User {
    // Поля сделаны приватными для соблюдения инкапсуляции
    private String name;
    private int age;

    // Конструктор с валидацией возраста
    public User(String name, int age) {
        this.name = name;
        setAge(age);
    }

    // Геттер для имени
    public String getName() {
        return name;
    }

    // Сеттер для имени (без валидации, так как для строки критерии не заданы)
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для возраста
    public int getAge() {
        return age;
    }

    // Сеттер для возраста с валидацией
    public void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException(
                    "Возраст должен быть в диапазоне от 0 до 150 лет"
            );
        }
        this.age = age;
    }
    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }
}
