import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class AnimalRegistry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Animal> animals = new HashMap<>();

        while (true) {
            System.out.println("1. Add new animal");
            System.out.println("2. List commands for an animal");
            System.out.println("3. Teach new command to an animal");
            System.out.println("4. List animals by date of birth");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            if (option == 1) {
                System.out.print("Enter animal name: ");
                String name = scanner.next();
                System.out.print("Enter animal type: ");
                String type = scanner.next();
                System.out.print("Enter date of birth: ");
                String dob = scanner.next();
                Animal animal = new Animal(name, type, dob);
                animals.put(name, animal);
            } else if (option == 2) {
                System.out.print("Enter animal name: ");
                String name = scanner.next();
                Animal animal = animals.get(name);
                animal.listCommands();
            } else if (option == 3) {
                System.out.print("Enter animal name: ");
                String name = scanner.next();
                Animal animal = animals.get(name);
                System.out.print("Enter new command: ");
                String command = scanner.next();
                System.out.print("Enter command description: ");
                String description = scanner.next();
                animal.addCommand(command, description);
                System.out.println("Command added successfully");
            } else if (option == 4) {
                System.out.println("List of animals by date of birth:");
                for (Animal animal : animals.values()) {
                    System.out.println(animal.name + " - " + animal.dateOfBirth);
                }
            } else if (option == 5) {
                System.out.println("Exiting program");
                break;
            } else {
                System.out.println("Invalid option");
            }
        }
        scanner.close();
    }
}
