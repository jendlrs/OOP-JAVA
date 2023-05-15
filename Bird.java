public abstract class Bird extends Animal {
    public Bird(String name, int age, String gender) {
        super(name, age, gender);
    }

    //Override Speak Method 
    public void speak() {
        System.out.println("The bird chirps.");
    }

    //Override Display Method
    public void displayInfo() {
        System.out.println("Bird - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}
