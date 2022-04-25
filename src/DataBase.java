public class DataBase {
    Car[] cars = new Car[4];

    public DataBase() {
        this.cars[0] = new Car("BMW", "3", 500.00, "KR11");
        this.cars[1] = new Car("Audi", "A3", 400.00, "KR22");
        this.cars[2] = new Car("Toyota", "Corolla", 300.00, "KR33");
        this.cars[3] = new Car("Kia", "Ceed", 200.00, "KR44");
    }

    /*boolean checkCar(String plate) {
        for(Car car : this.cars) {
            if(car.plate.equals(plate)) {
                return !car.rent;
            }
        }
        return false;
    }

    void rentCar(String plate) {
        for(Car car : this.cars) {
            if(car.plate.equals(plate)) {
                car.rent = true;
            }
        }
    }*/

    boolean rentCar(String plate) {
        for(Car car : this.cars) {
            if(car.plate.equals(plate)) {
                if(!car.rent) {
                    car.rent = true;
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
