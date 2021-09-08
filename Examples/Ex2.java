import java.util.Scanner;

public class Ex2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        double pos = 0;
        float neg = 0;
        float zero = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 0) {
                neg++;
            } else if (arr[i] > 0) {
                pos++;
            } else if (arr[i] == 0) {
                zero++;
            }
        }
        System.out.println(String.format("%.6f", pos / n));
        System.out.println(String.format("%.6f", neg / n));
        System.out.println(String.format("%.6f", zero / n));

    }
}