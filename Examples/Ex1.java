import java.util.Scanner;
import java.math.*;

public class Ex1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[3][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        int sum1 = 0;
        int sum2 = 0;
        // diagonal sum
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - i - 1];

        }
        int diff = sum1 - sum2;
        System.out.println(Math.abs(diff));

    }

}
