package OOEinstieg.ErstesObjekt.Fernbedienung;

public class Battery {
    private double charge; // Prozentuale Ladung der Batterie

    public Battery(double charge) {
        this.charge = charge;
    }

    public double getStatus() {
        return charge;
    }

    public void turnOn() {
        if (charge >= 5) {
            charge -= 5; // Beim Einschalten wird Ladung verbraucht
            System.out.println("Fernbedienung eingeschaltet.");
        } else {
            System.out.println("Batterie fast leer!");
        }
    }

    public void turnOff() {
        System.out.println("Kein Verbraucher angeschlossen.");
    }
}
