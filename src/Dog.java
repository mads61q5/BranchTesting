public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof!");
    }

    @Override
    public boolean eat(String foodType) {
        return false;
    }

    @Override
    public boolean showMood(Boolean mood) {
        if (mood) {
            System.out.println("Logrer");
        } else {
            System.out.println("Knurrer");
        }
        return mood;


    }
}
