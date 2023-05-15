public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("Mufasa", 5, "Male");
        lion.displayInfo();
        lion.speak();

        Elephant elephant = new Elephant("Adira", 13, "Female");
        elephant.displayInfo();
        elephant.speak();
    }
}