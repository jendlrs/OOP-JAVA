public class Main {
    public static void main(String[] args) {
        
        System.out.print("\n"); //Empty Line
        Lion lion = new Lion("Mufasa", 5, "Male");
        lion.displayInfo();
        lion.speak();
        System.out.print("\n");

        Elephant elephant = new Elephant("Adira", 13, "Female");
        elephant.displayInfo();
        elephant.speak();
        System.out.print("\n");

        Snake snake = new Snake("Nagini", 9, "Male");
        snake.displayInfo();
        snake.speak();
        System.out.print("\n");

        Lizard lizard = new Lizard("Raplo", 4, "Male");
        lizard.displayInfo();
        lizard.speak();
        System.out.print("\n");

        Eagle eagle = new Eagle("Artemis", 21, "Female");
        eagle.displayInfo();
        eagle.speak();
        System.out.print("\n");

        Parrot parrot = new Parrot("Polly", 4, "Female");
        parrot.displayInfo();
        parrot.speak();
        System.out.print("\n");

    }
}