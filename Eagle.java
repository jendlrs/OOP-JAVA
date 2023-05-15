public class Eagle extends Bird {
    public Eagle(String name, int age, String gender) {
        super(name, age, gender);
    }

    //Override Speak Method
    public void speak() {
        System.out.println("Screech! Screech!");
    }

    //Override Display Method
    public void displayInfo() {
        System.out.println("Eagle - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}
