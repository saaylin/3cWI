package Strings;

public class arrays {
    public static void main(String[] args) {
        int[] wuerfe = new int[6];

        wuerfe[4] = 9;

        for (int i = 0; i < wuerfe.length; i++) {
            System.out.println(wuerfe[i] + " ");
        }

        int[][] playGround = new int[3][3];

        playGround[0][0] = 1;
        playGround[2][1] = 2;

        System.out.println("--------");

        for (int row = 0; row < playGround.length; row++) {
            for (int col = 0; col < playGround.length; col++) {
                System.out.print(playGround[row][col] + " ");
            }
            System.out.println();
        }
    }
}
