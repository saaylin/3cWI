package IfBedingungen;

import java.util.Random;


public class if_bedingungen {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 0 und 100
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        if ((randomNumber > 50) && (randomNumber < 90)) {

        } else if (randomNumber < 10) {

        } else {

        }
    }

    public static class if_bedingungen_01 {
        public static void main(String[] args) {
            Random random = new Random();
            int randomNumber = random.nextInt(100);

            if (randomNumber < 20) {
                System.out.print("Mini");
            } else if ((randomNumber > 20) && (randomNumber < 50)) {
                System.out.print("Medium");
            } else if (randomNumber < 50) {
                System.out.print("Large");
            }
        }
    }
}
