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

   ;
    } static int[] findTwoElement(int arr[], int n) {
        // code here
        int repeated = 0;
        int[] ans = new int[2];
        for (int i = 0; i < n; i++) {
            // absolute value isliye karre qki agar koi value 
            // phle hiarray me (-) ban chuki ho to apn vo 
            // index me value dalna chahenge to arrayindexoutofbound ho jayega 
            // isliye absolute karre
            int index = Math.abs(arr[i]);

            if (arr[index - 1] > 0)
            // jab arr[4] me aayega to phle hi value negative raegi usme 
            // isliye condition false ho jayegi aur phir vo index me jo value rahegi 
            // vo return kar denge***************
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
}// } Driver Code Ends
