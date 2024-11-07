package TicTacToe;

import java.util.Scanner;

public class tictactoe {
    static int[][] field = new int[3][3];
    static Scanner scanner = new Scanner(System.in);
    static boolean isPlayer1 = true;


    public static void main(String[] args) {
        run();
    }

    public static void run() {

        while (true) {
            if (isPlayer1) {
                System.out.println("Player 1");
            } else {
                System.out.println("Player 2");
            }
            String inputOfPlayer = scanner.next();
            String[] input = inputOfPlayer.split(",");
            int input1 = Integer.parseInt(input[0]);
            int input2 = Integer.parseInt(input[1]);
            if (isPlayer1) {
                field[input1][input2] = 1;
            } else {
                field[input1][input2] = 2;
            }

            System.out.println(input1 + "-" + input2);
            isPlayer1 = !isPlayer1;
        }
    }
}
