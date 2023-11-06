import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
            main.run(scanner);
        }


    void run(Scanner scanner) throws FileNotFoundException{
        scanner = new Scanner(System.in);
        System.out.println("Podaj kod kraju, o którym chcesz zobaczyć informacje: ");
        String country = scanner.nextLine();
        String file="countries.csv";
        Files files=new Files();
        try {
            Map<String, Country> countryMap = files.readFile(file);
            Country country1 = null;
            for (Map.Entry<String, Country> entry : countryMap.entrySet()) {
                if (country.equals(entry.getKey())) {
                    country1 = entry.getValue();
                    System.out.println(country1.getCountryName() + " " + "(" + country1.getCode() + ")" + " ma " + country1.getAmountPeople() + " ludności");
                    return;
                }
            }
            if (country1 == null) {
                System.out.println("Kod kraju " + country + " nie został znaleziony");
            }
        }catch (IOException e) {
            throw new FileNotFoundException("Brak pliku " + file + ".");
        }


    }
}
