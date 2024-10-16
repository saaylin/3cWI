/*Erstelle ein Würfelspiel! Du spielst gegen den Computer.
Wenn das Spiel startet (mit einem kleinen Menü),
hat der Spieler 6 Würfe. Er spielt dabei gegen den Computer.
Wenn die Augensumme höher ist als jene des Computers hat der Spieler gewonnen,
ansonsten der Computer.  */

package Würfelspiel;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class wuerfelspiel {
   public static int wuerfel (){
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      int spieler = 0;
      int computer = 0;
      int anzahlWuerfe = 6;

      System.out.println("Wilkommen zum Würfelspiel!");
      System.out.println("Du hast " + anzahlWuerfe + " Würfe.");
      System.out.println("Drück Enter, um zu beginnen...");

      // Spieler Würfe
      System.out.println("Deine Würfe: ");
      for (int i = 1; i <= anzahlWuerfe; i++){
          System.out.print("Wurf " + i + ": ");
          int wurf = wuerfel();
          System.out.println(wurf);
          spieler += wurf;
      }

        System.out.println("Die Gesamtsummer deiner Würfe; " + spieler);

      // Computer würfel
        System.out.println("Der Computer würfelt jetzt...");
        for (int i = 1; i <= anzahlWuerfe; i++){
            int wurf = wuerfel();
            computer += wurf;
        }
        System.out.println("Die Gesamtsumme der würfe des Computers: " + computer);

        //Auswertung der Ergebnisse
        if (spieler > computer){
            System.out.println( "Du hast gewonnen.");
        } else if ( spieler < computer) {
            System.out.println("Du hast verloren.");
        } else {
            System.out.println("Unentschieden.");
        }

        System.out.println(" Auf Wiedersehen!");
        scanner.close();
    }
}
