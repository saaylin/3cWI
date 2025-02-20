package Rechner;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Calculator app = new Calculator();
    }
    public void run() {
        Scanner scanner = new Scanner(System.in);
        trigonometrie sciCalc = new trigonometrie();
        wurzel rootCalc = new wurzel();
        Calculator basicCalc= new Calculator();

        int num1 = 5;
        int num2 = 10;

        System.out.println("Wähle aus: +, -, *, /, sin, cos, sqrt");
        String operation = scanner.next();

    }
}
