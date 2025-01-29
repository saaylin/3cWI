package OOEinstieg.ErstesObjekt.Car;

public class tank1 {
    private double fuelAmount;

    public tank1(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void useFuel(double amount) {
        if (fuelAmount >= amount) {
            fuelAmount -= amount;
        } else {
            System.out.println("Nicht genug Kraftstoff.");
        }
    }
    public void refuel(double amount) {
        fuelAmount += amount;
    }
}
