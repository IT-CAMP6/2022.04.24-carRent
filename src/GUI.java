public class GUI {
    void showMainMenu() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Exit");
    }

    void listCars(Car[] cars) {
        for(Car car : cars) {
            System.out.print(car.brand + " " +
                    car.model + " Cena: " +
                    car.price + " Numer rejestracyjny: " +
                    car.plate + " Zajety : ");

            if(car.rent) {
                System.out.println("Tak");
            } else {
                System.out.println("Nie");
            }

            /*if(car.rent) {
                System.out.print(car.brand + " " +
                        car.model + " Cena: " +
                        car.price + " Numer rejestracyjny: " +
                        car.plate + " Zajety : Tak");
            } else {
                System.out.print(car.brand + " " +
                        car.model + " Cena: " +
                        car.price + " Numer rejestracyjny: " +
                        car.plate + " Zajety : Nie");
            }*/

            /*String rentText;

            if(car.rent) {
                rentText = "Tak";
            } else {
                rentText = "Nie";
            }
            System.out.println(car.brand + " " +
                    car.model + " Cena: " +
                    car.price + " Numer rejestracyjny: " +
                    car.plate + " Zajety : " + rentText);*/
        }
    }
}
