import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Files {
    public Map<String, Country>  readFile(File fileName) throws FileNotFoundException {
        Map<String, Country> countryMap = new HashMap<>();
            try (Scanner scanner = new Scanner(fileName)) {
                while (scanner.hasNextLine()) {
                    String[] elements = scanner.nextLine().split(";");
                    countryMap.put(elements[0], new Country(elements[0], elements[1], Integer.parseInt(elements[2])));
                }
            }
        return countryMap;
    }
}
