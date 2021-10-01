public class MaxCircularSubArray {
    public static void main(String[] args) {
        System.out.println(findSum(new int[] {5, -2, 3, 4}));
    }

    public static int findSum(int arr[]) {
        int res=arr[0];

        for(int i=0;i<arr.length;i++) {
            int curr_max=arr[i];
            int curr_sum=arr[i];

            for(int j=1;j<arr.length;j++) {
                int index = (i+j)%2;
                curr_sum += arr[index];
                curr_max = Math.max(curr_sum, curr_max);
            }

            res = Math.max(res, curr_max);

        }

        return res;

    }
}

/* This is a circular sum sub array i.e. last element
 connected to first element like element at index 4 will 
 iterate upto 3rd index element 
 for(  0(n2)  ) calculating this we use i+j%2 for next index */ 

// output
/* [5, -2, 3, 4]
   5 curr_sum = 3, 6, 7 max=7
   -2 curr_um = 1, 5, (1+3)%4=0 so 5+arr[0]=10 max=(1,5,10)=10
   3 curr_sum = 7, 12, (12+(-2)=11) max=11
   4 curr_sum = 9, 7, 10 max = 10
*/
