//Erstelle ein Programm, dass Zufallszahlen zwischen 10 und 30 generiert.
// Das Programm soll die Zufallszahlen zusammenzählen. Sobald die Zahl 15 oder die Zahl 25 kommt,
// wird das Programm beendet und die Summe der vorherigen Zufallszahlen ausgegeben!

package WhileLoop;

import java.util.Random;

public class whileloop01 {
    public static void main(String[] args) {
        Random random = new Random ();
        int sum = 0;
        int number;

        while(true){
            number = 10+ random.nextInt(21);

        if (number = 15 || number = 25) {
            break;
            }

        sum += number;
        System.out.println("Generierte Zahl: " + number);
        }

        System.out.println("Die Summe der vorherigen Zufallszahlen beträgt: " +sum);
    }
}
