import java.util.Map;

public class Country {
    private String code;
    private String countryName;
    private int amountPeople;

    public Country(String code, String countryName, int amountPeople) {
        this.code = code;
        this.countryName = countryName;
        this.amountPeople = amountPeople;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", countryName='" + countryName + '\'' +
                ", amountPeople=" + amountPeople +
                '}';
    }

    public String getCode() {
        return code;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getAmountPeople() {
        return amountPeople;
    }

    public static void viewCountry(Map<String, Country> countryMap, String country) {
        Country country1 = null;
        for (Map.Entry<String, Country> entry : countryMap.entrySet()) {
            if (country.equals(entry.getKey())) {
                country1 = entry.getValue();
                System.out.println(country1.getCountryName() + " " + "(" + country1.getCode() + ")" + " ma " + country1.getAmountPeople() + " ludności.");
                return;
            }
        }
        if (country1 == null) {
            System.out.println("Kod kraju " + country + " nie został znaleziony.");
        }
    }
}
