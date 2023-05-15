public class Parrot extends Bird {
    public Parrot(String name, int age, String gender) {
        super(name, age, gender);
    }

    //Override Speak Method
    public void speak() {
        System.out.println("Cah! Cah! Cah!");
    }

    //Override Display Method
    public void displayInfo() {
        System.out.println("Parrot - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}