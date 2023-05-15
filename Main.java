public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("Mufasa", 5, "Male");
        lion.displayInfo();
        lion.speak();

        Elephant elephant = new Elephant("Adira", 13, "Female");
        elephant.displayInfo();
        elephant.speak();

        Snake snake = new Snake("Nagini", 9, "Male");
        snake.displayInfo();
        snake.speak();

        Lizard lizard = new Lizard("Raplo", 4, "Male");
        lizard.displayInfo();
        lizard.speak();

        Eagle eagle = new Eagle("Artemis", 21, "Female");
        eagle.displayInfo();
        eagle.speak();

        Parrot parrot = new Parrot("Polly", 4, "Female");
        parrot.displayInfo();
        parrot.speak();
        
    }
}