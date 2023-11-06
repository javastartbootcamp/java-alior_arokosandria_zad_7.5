import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Files {
    public Map<String, Country> readFile() throws FileNotFoundException {
        Map<String, Country> countryMap = new HashMap<>();
        File file = new File("countries.csv");
        if (checkFile(file)) {
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    String[] elements = scanner.nextLine().split(";");
                    countryMap.put(elements[0], new Country(elements[0], elements[1], Integer.parseInt(elements[2])));
                }
            }
        }
        return countryMap;
    }

    public boolean checkFile(File file) {
        if (file.exists()) {
            return true;
        }
        System.out.println("Brak pliku " + file.getName());
        return false;
    }
}
