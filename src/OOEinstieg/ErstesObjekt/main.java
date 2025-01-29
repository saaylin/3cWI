package OOEinstieg.ErstesObjekt;


public class main {
        public static void main(String[] args) {
            // Initialisierung der Objekte
            engine e1 = new engine(140, engine.TYPE.DIESEL);
            Rearmirror r1 = new Rearmirror(100, 0);
            Rearmirror r2 = new Rearmirror(90, 40);

            // Reifen erstellen
            reifen reifen1 = new reifen(17, "Sommer");
            reifen reifen2 = new reifen(17, "Sommer");
            reifen reifen3 = new reifen(17, "Sommer");
            reifen reifen4 = new reifen(17, "Sommer");

            // Konstruktor der Cars-Klasse erfordert mehr Parameter
            car c1 = new car(e1, "red", "123ABC", 50, 5); // Beispielwerte für carSerialNumber und fuelAmount
            c1.addMirror(r1);
            c1.addMirror(r2);
            c1.addReifen(reifen1);
            c1.addReifen(reifen2);
            c1.addReifen(reifen3);
            c1.addReifen(reifen4);

            // Ausgabe der Position des ersten Rückspiegels und der PS des Motors
            System.out.println(c1.getMirrors().get(0).getPosition());
            System.out.println(c1.getengine().getHorsePower());
            System.out.println("Das Auto hat " + c1.getMirrors().size() + " Rückspiegel.");
            System.out.println("Das Auto hat " + c1.getReifen().size() + " Reifen.");


        }
    }

