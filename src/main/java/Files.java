import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Files {
    public Map<String, Country>  readFile(String fileName) throws FileNotFoundException {
        Map<String, Country> countryMap = new HashMap<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String[] elements = scanner.nextLine().split(";");
                countryMap.put(elements[0], new Country(elements[0], elements[1], Integer.parseInt(elements[2])));
            }
        } catch (IOException e) {
            throw new FileNotFoundException("Brak pliku " + fileName + ".");
        }

        return countryMap;
    }
}
