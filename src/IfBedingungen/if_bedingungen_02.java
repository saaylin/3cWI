package IfBedingungen;// Erstelle zwei Zufallszahl zwischen 0 und 100

// Wenn die erste Zahl kleiner ist als die zweite UND die erste Zahl kleiner ist als 50
// dann gib aus "Zahl 1 ist kleiner als Zahl 2 und Mini"

// Wenn die erste Zahl kleiner ist als 30 oder die zweite Zahl kleiner ist als 30
// dann gib aus "Eine der beiden ist kleiner als 30"

// Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist
// dann gib aus "Erste Zahl klein, zweite kein 50iger"


import java.util.Random;

public class if_bedingungen_02 {
    public static void main(String[] args) {
        Random random = new Random();

        int random1 = random.nextInt( 100);
        int random2 = random.nextInt(100);

        System.out.print(random1);
        System.out.print(random2);

        if ((random1<random2) && (random1<50)){
            System.out.print("ZAhl 1 ist kleiner Zahl 2 und Mini");
        } if ((random1<30) || (random2 < 30)){
            System.out.println ("Eine der beiden ist kleiner als 30");
        }
        if ((random1 <50) && (random2 != 50)){
            System.out.println("Erste ZAhl klein, zweite kein 50iger");
        }
    }
}


