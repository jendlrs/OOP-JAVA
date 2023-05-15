// Create abstract subclasses for different types of animals, such as Mammal, Reptile, and Bird.
// These abstract subclasses should inherit from the Animal class and override the speak() and
// displayInfo() methods with their specific implementation.

public abstract class Mammal extends Animal {
    public Mammal(String name, int age, String gender) {
        super(name, age, gender);
    }
}
