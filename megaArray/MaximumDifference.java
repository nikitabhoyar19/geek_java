import java.lang.Math;
public class MaximumDifference {
    public static void main(String[] args) {
        int arr[] = {6,8,9,4,11,21,4,7,8,9,21};
        System.out.println(findMaximum(arr));
    }

    public static int findMaximum(int arr[]) {
        int currentMinValue=arr[0];
        int res=arr[1]-arr[0];

        for(int i=1;i<arr.length;i++) {
            res=Math.max(res, arr[i]-currentMinValue);
            currentMinValue=Math.min(currentMinValue, arr[i]);
        }

        return res;

    }
}

// res=1, currentMinValue=2
// res=(1,1)=1, currentMinValue=(2,3)=2
// res=(1,8)=8, currentMinValue=(2,6)=2
// res=8, currentMinValue=2
