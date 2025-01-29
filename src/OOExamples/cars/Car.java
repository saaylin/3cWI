package OOExamples.cars;

public class Car {
    private String color;
    private int maxSpeed;
    private double basePrice;
    private double baseConsumption;
    private Manufacturer manufacturer;
    private Engine engine;
    private double mileage; // Aktuelle Kilometeranzahl

    public Car(String color, int maxSpeed, double basePrice, double baseConsumption, Manufacturer manufacturer, Engine engine) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.baseConsumption = baseConsumption;
        this.manufacturer = manufacturer;
        this.engine = engine;
        this.mileage = 0; // Start mit 0 km
    }

    public double calculatePrice() {
        return basePrice * (1 - manufacturer.getDiscount() / 100);
    }

    public double calculateConsumption() {
        if (mileage > 50000) {
            return baseConsumption * 1.098; // +9.8% nach 50.000 km
        }
        return baseConsumption;
    }

    public void drive(double kilometers) {
        if (kilometers > 0) {
            mileage += kilometers;
            System.out.println("Das Auto ist " + kilometers + " km gefahren. Gesamt: " + mileage + " km");
        } else {
            System.out.println("Ungültige Kilometerangabe!");
        }
    }

    public void printCarInfo() {
        System.out.println("Auto: " + manufacturer.getName() + " | Farbe: " + color);
        System.out.println("Max. Geschwindigkeit: " + maxSpeed + " km/h");
        System.out.println("Basispreis: " + basePrice + "€ | Rabattpreis: " + calculatePrice() + "€");
        System.out.println("Motor: " + engine.getType() + " mit " + engine.getHorsepower() + " PS");
        System.out.println("Verbrauch: " + baseConsumption + " L/100km | Aktuell: " + calculateConsumption() + " L/100km");
        System.out.println("Kilometerstand: " + mileage + " km");
    }
}
