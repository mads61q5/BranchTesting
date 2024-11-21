public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Woof Woof!");
    }

    @Override
    public boolean eat(String foodType) {
        return false;
    }
}
