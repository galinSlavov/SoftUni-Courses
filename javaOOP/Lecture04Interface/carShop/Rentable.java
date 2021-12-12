package Lecture04Interface.carShop;

public interface Rentable extends Car {
    Integer getMinRentDay();
    Double getPricePerDay();
}
