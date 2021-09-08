
// Initial Template for Java
import java.io.*;
import java.util.*;

class MissingNumber {
    // Driver code
    public static void main(String[] args) {
        int arr[] = { 2, 2 };
        int n = arr.length;
        int[] ans = findTwoElement(arr, n);
        System.out.println(ans[0] + " " + ans[1]);

    }

    static int[] findTwoElement(int arr[], int n) {
        // code here
        int repeated = 0;
        int[] ans = new int[2];
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]);

            if (arr[index - 1] > 0)
                arr[index - 1] = -arr[index - 1];
            // yahape apn arr of values change karre element ko minus karke
            // to agar same nahi hai to uski value 0 nahi hongi aur vo return karvdega jo
            // index ki value 0 nahi hai
            else
                repeated = index;
        }

        ans[0] = repeated;

        for (int i = 0; i < n; i++)
            if (arr[i] > 0) {
                ans[1] = i + 1;
                // so everything is here will 0 except the one who is repeated
                return ans;
            }

        return arr;
    }
}// } Driver Code Ends
