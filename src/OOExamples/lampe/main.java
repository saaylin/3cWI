package OOExamples.lampe;

public class main {
        public static void main(String[] args) {
            // Lampen und Glühelemente erstellen
            Lamp lamp = new Lamp();
            licht light1 = new licht("Licht 1", "Blau", 10);
            licht light2 = new licht("Licht 2", "Grün", 12);
            lamp.addLightElement(light1);
            lamp.addLightElement(light2);

            // Alle Lichter einschalten und Verbrauch berechnen
            lamp.turnAllOn();
            System.out.println("Gesamt Stromverbrauch: " + lamp.getOverallPowerUsage() + " Watt");
            lamp.printNamesOfLightElements();
        }
    }
