package lecture6;

public class P01Car {
    private String brand;
    private String model;
    private int horsePower;

    //constructor
    public P01Car(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    //if you want to call the second constructor from the first with some differences in data
    public P01Car(String brand, String model) {
        //we call this but not with "this." but inside "()"
        this(brand, model, -1);
        //with "this" we save what is wrote in the next line
        //this.brand = brand;
        //this.model = model;
        //this.horsePower = 0;
    }
    //We can wrote different variables for the same constructor
    public P01Car(String brand, int horsePower) {
        this(brand, "unknown", -1);
    }

    public P01Car(String brand) {
        this(brand, "unknown", -1);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    //setter
    public void setHorsePower(int horsePower) {
        if (horsePower < 0) {
            horsePower = 0;
        }
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.",
                this.getBrand(), this.getModel(), this.getHorsePower());

//        @Override
//    public String toString() {
//        return String.format("This car is: %s %s %d HP.",
//                this.getBrand(), this.getModel(), this.getHorsePower());
    }
}
