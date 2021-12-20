package ss7_AbtractAndInterface.thuc_hanh;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    public String howToEat() {
        return "could be fried";
    }


}
