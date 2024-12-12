package OOEinstieg.ErstesObjekt;


public class Objekt01 {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.setBrand("Brand");
        c1.setFuelConsumption(7);
        c1.setSerialNumber("1234");
        c1.setFuelAmount(800);
        c1.setTank(70);

        System.out.println(c1.fuelAmount);
        c1.drive();
        System.out.println(c1.fuelAmount);
        c1.turboBoost();
    }
}


