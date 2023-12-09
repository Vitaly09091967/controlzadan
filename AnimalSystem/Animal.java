public abstract class Animal {
    protected int id;
    protected String name;
    protected String type;
    protected String birthDate;
    protected String[] commands;

    public Animal(int id, String name, String type, String birthDate, String[] commands) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.birthDate = birthDate;
        this.commands = commands;
    }

    // Геттеры и сеттеры

    public abstract void printInfo(); // метод для вывода информации о животном
}
