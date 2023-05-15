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
    }
}