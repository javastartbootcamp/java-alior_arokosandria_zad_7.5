import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        main.run(scanner);

    }

    void run(Scanner scanner){
        scanner = new Scanner(System.in);
        System.out.println("Podaj kod kraju, o którym chcesz zobaczyć informacje: ");
        String country = scanner.nextLine();
        String file="countries.csv";
        Files files=new Files();
        try {
            Map<String, Country> countryMap = files.readFile(file);
            }
        catch (FileNotFoundException e){
            System.out.println("Brak pliku " + file + ".");
        }
    }
}


