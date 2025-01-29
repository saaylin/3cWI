package OOEinstieg.ErstesObjekt.Fernbedienung;

public class Fernbedienung {
    private Battery battery1;
    private Battery battery2;

    public Fernbedienung(double charge1, double charge2) {
        this.battery1 = new Battery(charge1);
        this.battery2 = new Battery(charge2);
    }

    public double getStatus() {
        return (battery1.getStatus() + battery2.getStatus()) / 2; // Durchschnittliche Ladung beider Batterien
    }

    public void turnOn() {
        battery1.turnOn();
        battery2.turnOn();
    }

    public void turnOff() {
        System.out.println("Fernbedienung ausgeschaltet.");
    }
}


