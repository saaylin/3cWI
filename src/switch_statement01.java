// Erstelle eine Zufallszahl zwischen 5 und 10

// Wenn der Wert 10 ist gib aus Ten
// Wenn der Wert 9 ist gib aus Nine
// Wenn der Wert 8 ist gib aus Eight
// etc.


import java.until.Random;

public class switch_statement01 {
    Random random = new Random ();

    int randomnumber1 = random.nextInt(origin:5, bound:10);


    System.out.println(randomnumber1);

    switsch(randomnumber1){
        case 10:
            System.out.println("Ten");
            break;

        case 9:
            System.out.print("Nine");
            break;

        case 8:
            System.out.println("Eight");
            break;

        default:
            System.out.println("other value");
            break;
    }
}
