public class Lion extends Mammal {
    public Lion(String name, int age, String gender) {
        super(name, age, gender);
    }

    //@Override
    public void speak() {
        System.out.println("The lion roars!");
    }

    //@Override
    public void displayInfo() {
        System.out.println("Lion - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}