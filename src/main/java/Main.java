import java.util.Map;
import java.util.Scanner;

public class Main {

    // nie zmieniaj nic w main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        main.run(scanner);
    }

    void run(Scanner scanner) {
        String filePath = "countries.csv";
        if (Files.doesFileExist(filePath)) {
            System.out.println("Podaj kod kraju, o którym chcesz zobaczyć informacje: ");
            String country = scanner.nextLine();
            Files files = new Files();
            Map<String, Country> countryMap = files.readFile(filePath);
            Country.viewCountry(countryMap, country);

        } else {
            System.out.println("Brak pliku " + filePath + ".");
        }
    }

}

