
public class Country {
    private String code;
    private String name;
    private int amountPeople;

    public Country(String code, String countryName, int amountPeople) {
        this.code = code;
        this.name = countryName;
        this.amountPeople = amountPeople;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", countryName='" + name + '\'' +
                ", amountPeople=" + amountPeople +
                '}';
    }

    public String getCode() {
        return code;
    }

    public String getCountryName() {
        return name;
    }

    public int getAmountPeople() {
        return amountPeople;
    }

}
