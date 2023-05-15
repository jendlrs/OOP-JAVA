public class Snake extends Reptile {
    public Snake(String name, int age, String gender) {
        super(name, age, gender);
    }

    //Override Speak Method
    public void speak() {
        System.out.println("Hiss! Hiss!");
    }

    //Override Display Method
    public void displayInfo() {
        System.out.println("Snake - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}
