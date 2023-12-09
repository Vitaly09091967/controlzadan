import java.util.HashMap;
import java.util.Map;

class Animal {
    String name;
    String type;
    String dateOfBirth;
    Map<String, String> commands;

    public Animal(String name, String type, String dateOfBirth) {
        this.name = name;
        this.type = type;
        this.dateOfBirth = dateOfBirth;
        this.commands = new HashMap<>();
    }

    public void addCommand(String command, String description) {
        commands.put(command, description);
    }

    public void listCommands() {
        System.out.println("List of commands for " + name + ":");
        for (Map.Entry<String, String> entry : commands.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
