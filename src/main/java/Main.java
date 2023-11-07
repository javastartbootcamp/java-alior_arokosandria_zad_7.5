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
        String filePath= "countries.csv";
        if(Files.doesFileExist(filePath)){
            System.out.println("Podaj kod kraju, o którym chcesz zobaczyć informacje: ");
            String country = scanner.nextLine();
            Files files = new Files();
            Map<String, Country> countryMap = files.readFile(filePath);
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
        }else{
            System.out.println("Plik nie istnieje");
        }
    }

}

