public class AnimalCounter {
    private static int petCount = 0;
    private static int packAnimalCount = 0;

    public static void incrementPetCount() {
        petCount++;
    }

    public static void incrementPackAnimalCount() {
        packAnimalCount++;
    }

    public static void displayCounts() {
        System.out.println("Total Pets: " + petCount);
        System.out.println("Total Pack Animals: " + packAnimalCount);
    }
}
