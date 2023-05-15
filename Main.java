// Create a main class, do the following:
// a. Instantiate different animal objects.
// b. Call the displayInfo() and speak() methods to display the animals' information and 
// speak value.

public class Main {
    public static void main(String[] args) {

        System.out.print("\n"); //Empty Line

        Lion lion = new Lion("Mufasa", 5, "Male");
        Elephant elephant = new Elephant("Adira", 13, "Female");
        Snake snake = new Snake("Nagini", 9, "Male");
        Lizard lizard = new Lizard("Raplo", 4, "Male");
        Eagle eagle = new Eagle("Artemis", 21, "Female");
        Parrot parrot = new Parrot("Sparkle", 4, "Female");

        lion.displayInfo();
        lion.speak();
        System.out.print("\n");

        elephant.displayInfo();
        elephant.speak();
        System.out.print("\n");

        snake.displayInfo();
        snake.speak();
        System.out.print("\n");

        lizard.displayInfo();
        lizard.speak();
        System.out.print("\n");

        eagle.displayInfo();
        eagle.speak();
        System.out.print("\n");

        parrot.displayInfo();
        parrot.speak();
        System.out.print("\n");

    }
}