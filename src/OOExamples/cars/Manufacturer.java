package OOExamples.cars;

public class Manufacturer {
    private String name;
    private String country;
    private double discount; // Rabatt in Prozent (z. B. 10 für 10%)

    public Manufacturer(String name, String country, double discount) {
        this.name = name;
        this.country = country;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }
}
