package _07_InterfacesAndAbstraction._02_CarShopExtended;

public class Seat extends CarImpl implements Sellable {

    private Double price;

    public Seat(String model, String color, Integer horsepower, String countryProduced, Double price) {
        super(model, color, horsepower, countryProduced);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s sells for %.6f",super.toString(),getModel(), getPrice());
    }
}
