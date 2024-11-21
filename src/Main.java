public class Main {
    public static void main(String[] args) {


        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();

        dog.eat("dog food");
        cat.eat("cat food");

        dog.showMood(true);
        dog.showMood(false);
        cat.showMood(true);
        cat.showMood(false);


    }
}
