public class if_bedingungen {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 0 und 100
        Random random = new Random();
        int randomNumber = random.nextInt (bound: 100);

        if ((randomNumber>50) && (randomNumber<90)) {

        } else if (randomNumber<10) {

        }else{

        }
    }
}
