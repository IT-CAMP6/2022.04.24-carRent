import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        GUI gui = new GUI();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            gui.showMainMenu();
            switch (scanner.nextLine()) {
                case "1":
                    gui.listCars(db.cars);
                    break;
                case "2":
                    System.out.println("Podaj numer rejestracyjny: ");
                    if (db.rentCar(scanner.nextLine())) {
                        System.out.println("OK !!!");
                    } else {
                        System.out.println("Nie ma takiego auta lub jest niedostepne !!");
                    }
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();

        System.out.println(text);*/


        /*String a = "Mateusz";
        String b = new String("Mateusz");

        boolean result = a.equals(b);

        System.out.println(result);*/
    }
}
