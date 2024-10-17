package Strings;

public class string_helper {
    public static void main(String[] args) {
        boolean isPalindrome = isPalindrome("anna");
        //so
        if (isPalindrome) {
            System.out.println("true");
        } else{
            System.out.println("false");
        }

        // Test count
        int amount = countLetters("ansadi", 'a');
        // sollte 1 sein
        System.out.println(amount);

        //Reverse String
        String reversed = reverseString("hello");
        // sollte olleh sein

        // Print amount of letters
        int amountOfLetters = getAmountofLetters("sepp");

    }
    public static boolean isPalindrome(String word){
        return true;
    }

    public static int countLetters(String word, char c){
        return 7;
    }
    public static String reverseString(String word){
        return "dlrow";
    }

    public static int getAmountofLetters(String word){
        return 5;
    }
}
