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
            Country countryName = countryMap.get(country);
            if (countryName == null) {
                System.out.println("Kod kraju " + country + " nie został znaleziony.");
            } else {
                System.out.println(countryName.getCountryName() + " " + "(" + countryName.getCode() + ")" + " ma "
                        + countryName.getAmountPeople() + " ludności.");
            }

        } else {
            System.out.println("Brak pliku " + filePath + ".");
        }
    }

}

