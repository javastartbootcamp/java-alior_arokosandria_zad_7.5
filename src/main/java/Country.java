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
}
