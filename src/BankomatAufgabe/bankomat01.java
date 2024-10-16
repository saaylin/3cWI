package BankomatAufgabe;

import java.util.Scanner;

public class bankomat01 {
    public static void main(String[] args){
        int balance = 0;
        boolean isFinished = false;

        while (!isFinished){
            System.out.println("Wählen Sie: 1 Einzahlen 2 Abheben 3 Kontostand 4 Beenden");
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();
            if (selection == 1) {
                System.out.println("Wie viel geld möchten sie Einzahlen?");
                int value = scanner.nextInt();
                balance += value;
                System.out.println(value);
                System.out.println("Sie haben" + value + "€ eingezahlt!");
            }

            if (selection==2){
                System.out.println("Wie viel Geld möchten sie abheben?");
                int value = scanner.nextInt();
                balance-=value;
                System.out.print(value);
                System.out.println("Sie haben " + value + "€ abgehoben.");
            }

            if (selection==3){
                System.out.println("Ihr Kontostand: " + balance+ "€");
            }

            if (selection == 4){
                System.out.println("Auf Wiedersehen!");
                isFinished=true;
            }
        }
    }
}



