import java.util.Scanner;
public class jaggedinput {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = in.nextInt();
        int[][] a = new int[r][];
        for (int i = 0; i < r; i++) {
            System.out.print("Enter columns for row " + i + ": ");
            int c = in.nextInt();
            a[i] = new int[c];
            for (int j = 0; j < c; j++) {
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("Matrix:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
