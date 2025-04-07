
public class TestAnimal {
    public static void main(String[] args) {
        // Create the registry
        AnimalRegistry registry = new AnimalRegistry();


        System.out.println("Creating animals from prototypes...");
        Animal sheep1 = registry.createSheep("Dolly");
        Animal sheep2 = registry.createSheep("Molly");
        Animal cow = registry.createCow();
        Animal horse = registry.createHorse();


        System.out.println("\nCreated animals:");
        System.out.println("- " + sheep1);
        System.out.println("- " + sheep2);
        System.out.println("- " + cow);
        System.out.println("- " + horse);


        System.out.println("\nAnimal sounds:");
        System.out.print("Sheep 1 says: ");
        sheep1.makeSound();
        System.out.print("Cow says: ");
        cow.makeSound();
        System.out.print("Horse says: ");
        horse.makeSound();
    }
}