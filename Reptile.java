public abstract class Reptile extends Animal {
    public Reptile(String name, int age, String gender) {
        super(name, age, gender);
    }

    //Override Speak Method
    public void speak() {
        System.out.println("The reptile hisses.");
    }

    //Override Display Method
    public void displayInfo() {
        System.out.println("Reptile - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}