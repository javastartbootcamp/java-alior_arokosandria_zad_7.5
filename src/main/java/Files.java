import java.io.File;
import java.io.IOException;
import java.util.*;

public class Files {
    public Map<String, Country> readFile() {
        Map<String, Country> countryMap = new HashMap<>();
        File file = new File("countries.csv");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String[] elements = scanner.nextLine().split(";");
                countryMap.put(elements[0], new Country(elements[0], elements[1], Integer.parseInt(elements[2])));
            }
        } catch (IOException e) {
            System.out.println("Brak pliku " + file.getName() + ".");
        }

        return countryMap;
    }
}
