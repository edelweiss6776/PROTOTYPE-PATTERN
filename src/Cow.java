// Step 4: Implement Cow
class Cow implements Animal {
    private static final int legs = 4;
    private static final String sound = "Moo";
    private static final String food = "Hay";
    private static final String type = "Cow";

    @Override
    public Animal clone() {
        return new Cow();
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return type;
    }

    // Additional method specific to Cow
    public int getLegs() {
        return legs;
    }

    @Override
    public String toString() {
        return "Cow [legs=" + legs + ", sound=" + sound + ", food=" + food + "]";
    }
}