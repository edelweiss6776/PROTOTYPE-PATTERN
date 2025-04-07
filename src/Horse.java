// Step 5: Implement Horse
class Horse implements Animal {
    private static final int legs = 4;
    private static final String sound = "Neigh";
    private static final String food = "Hay";
    private static final String type = "Horse";
    private String color;

    public Horse(String color) {
        this.color = color;
    }

    @Override
    public Animal clone() {
        return new Horse(this.color);
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return type;
    }

    // Additional methods specific to Horse
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Horse [legs=" + legs + ", sound=" + sound + ", food=" + food + ", color=" + color + "]";
    }
}