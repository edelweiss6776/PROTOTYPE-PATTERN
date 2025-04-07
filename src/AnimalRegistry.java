// Step 6: Create AnimalRegistry
class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry() {
        initializePrototypes();
    }

    private void initializePrototypes() {
        sheepPrototype = new Sheep("Default");
        cowPrototype = new Cow();
        horsePrototype = new Horse("Brown");
    }

    public Animal createSheep(String name) {
        Sheep sheep = (Sheep) sheepPrototype.clone();
        sheep.setName(name);
        return sheep;
    }

    public Animal createCow() {
        return cowPrototype.clone();
    }

    public Animal createHorse() {
        return horsePrototype.clone();
    }
}