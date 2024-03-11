package _09_Polymorphism._03_Animals;

public class Dog extends Animal {

    public Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    protected String explainSelf() {
        return String.format("I am %s and my favourite food is %s%n%s", this.getName(), this.getFavouriteFood(), "DJAAF");
    }
}
