// Step 3: Implement Sheep
class Sheep implements Animal {
    private String name;
    private static final String sound = "Baa";
    private static final String food = "Grass";
    private static final String type = "Sheep";

    public Sheep(String name) {
        this.name = name;
    }

    @Override
    public Animal clone() {
        return new Sheep(this.name);
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return type;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sheep [name=" + name + ", sound=" + sound + ", food=" + food + "]";
    }
}