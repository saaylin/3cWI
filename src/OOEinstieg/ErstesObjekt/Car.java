package OOEinstieg.ErstesObjekt;

public class Car {
    // instanz / gedächnisvariablen

    //don't do that later
    private int fuelConsumption;
    private int Tank;
    private int fuelAmount;
    private String brand;
    private String serialNumber;
    private String color;


    public void drive() {
        if (fuelAmount >= fuelConsumption) {
            this.fuelAmount = this.fuelAmount - fuelConsumption;
            System.out.println("ich fahre");
        }
    }

    public void Break() {
        System.out.println("ich bremse"); 
    }

    public void turboBoost(){
        if (fuelAmount > fuelConsumption * 0.1){
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go Super fast!");
        }
    }

    public void honk(int Repetitions){
        while (Repetitions > 0){
            Repetitions -= 1;
            System.out.println("tuut");
        }
    }

    public void getRemainingRange(){
        int range = fuelAmount / fuelConsumption;

        if (range > 1){
            System.out.printf("you can drive more kilometers!", range);
        }
        if (range == 1){
            System.out.printf("you can drive more kilometers!", range);
        }
        if (range < 1){
            System.out.printf("you can't drive any more kilometers!");
        }
    }

    public void setTank(int tank) {
        Tank = tank;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFuelAmount(int fuelAmount) {
        if (fuelAmount>100){
            this.fuelAmount=100;
        } else {
            this.fuelAmount = fuelAmount;
        }

    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getTank() {
        return Tank;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
