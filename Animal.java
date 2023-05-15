// Create an abstract class Animal with the following attributes/properties and methods:
// Attributes/Properties: name (String), age (int), gender (String)
// Constructor to initialize the properties
// Abstract methods: speak() and displayInfo()

abstract class Animal {
    private String name;
    private int age;
    private String gender;

    //Constructor with parameters
    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    //Abtract Methods
    public abstract void speak();

    public abstract void displayInfo();
}