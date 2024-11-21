public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Miaw Miaw!");
    }

    @Override
    public boolean eat(String foodType) {
        return false;
    }

    @Override
    public boolean showMood(Boolean mood) {
        if (mood) {
            System.out.println("Spinder");
        } else {
            System.out.println("Hvæser");
        }
        return mood;

    }
}
