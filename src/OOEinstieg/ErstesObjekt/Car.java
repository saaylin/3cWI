package OOEinstieg.ErstesObjekt;

public class Car {
    // instanz / gedächnisvariablen

    //don't do that later
    public int fuelConsumption;
    public String brand;
    public String serialNumber;
    public int fuelAmount;
    public String bremse;
    public int turboBoost;
    public int amountOfRepetition;


    public void drive() {
        this.fuelAmount = this.fuelAmount
                - fuelConsumption;
        System.out.println("ich fahre");
    }

    public void doBreak(){
        System.out.println("ich bremse"); 
    }

    public void turboBoost(){
        if (fuelAmount > fuelConsumption * 0.1){
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go Super fast!");
        }
    }


}
// to push