package Lecture04Interface.carShop;

public class Seat extends CarImpl implements Sellable {

    private final Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }


    @Override
    public Integer getPrice() {
        return this.getPrice();
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator()
                + getModel() + " sells for " + price;
    }
}

