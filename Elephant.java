public class Elephant extends Mammal {
    public Elephant(String name, int age, String gender) {
        super(name, age, gender);
    }

    //Override Speak Method
    public void speak() {
        System.out.println("Prew! Prew!");
    }

    //Override Display Method
    public void displayInfo() {
        System.out.println("Elephant - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}