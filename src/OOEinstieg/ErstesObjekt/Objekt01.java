package OOEinstieg.ErstesObjekt;


public class Objekt01 {
    public static void main(String[] args) {
        int a = 7;

        Car c1 = new Car();
        c1.brand = "BMW";
        c1.fuelConsumption = 7;
        c1.serialNumber = "A1234";
        c1.doBreak();
        c1.fuelAmount = 80;


        Car c2 = new Car();
        c2.brand = "Porsche";
        c2.fuelConsumption = 6;
        c2.serialNumber = "A5678";
        c2.bremse = "ich bremse";

        System.out.println(c1.fuelAmount);
        c1.drive();
        System.out.println(c2.bremse);


        // D R Y
    }
}


