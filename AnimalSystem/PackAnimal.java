public class PackAnimal extends Animal {
    public PackAnimal(int id, String name, String type, String birthDate, String[] commands) {
        super(id, name, type, birthDate, commands);
    }

    @Override
    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Commands: " + String.join(", ", commands));
    }
}
