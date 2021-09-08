import java.util.*;

public class Ex3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        // for (int i = 0; i < 5; i++) {
        // System.out.print(arr[i] + "");
        // }

        int min = arr[0] + arr[1] + arr[2] + arr[3];
        int max = arr[1] + arr[2] + arr[3] + arr[4];
        System.out.println(min + " " + max);
    }
}

///////////////////////////
// public class Solution {

// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
// long[] nums = new long[5];

// long max = 0, min= 0 , sum =0;
// nums[0] = max = min = sum = in.nextLong(); //Read the first value outside the
// loop, to handle min calculation
// for (int i = 1; i < 5; i++) {
// nums[i] = in.nextLong();
// if(nums[i]>max) max = nums[i];
// if(nums[i]<min) min = nums[i];
// sum += nums[i];
// }
// System.out.println( (sum - max) + " " + (sum - min));

// }
// }