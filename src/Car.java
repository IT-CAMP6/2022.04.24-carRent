public class Car {
    String brand;
    String model;
    double price;
    String plate;
    boolean rent;

    //boolean vip = false;

    public Car() {
    }

    public Car(String brand, String model, double price, String plate) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.plate = plate;
        this.rent = false;
    }
}
