public class MaximumSubArraySum {
    public static void main(String[] args) {
        System.out.println(subArraySum(new int[] { -5, -21, -5, -3, -4, -9, -11, 0}));
    }

    public static int subArraySum(int arr[]) {
        int globalCount = 0;
        int localCount = 0;

        for (int i = 0; i < arr.length; i++) {

            localCount += arr[i];

            if (localCount >= globalCount) {
                globalCount = localCount;
            }

            // whether to take this localCount with us or not
            if(localCount<0) {
                localCount=0;
            }

        }

        // if all elements are negaive
        if(globalCount==0) {
            globalCount= findMin(arr);
        }

        return globalCount;
    }

    public static int findMin(int[] arr) {
        int minElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minElement < arr[i]){
                minElement = arr[i];
            }
        }
        return minElement;
    }
}

 /*  // this is another way
        for (int i = 0; i < arr.length; i++) {

            localCount=Math.max(localCount+arr[i], arr[i]);
            globalCount=Math.max(localCount, globalCount);
           
        }

        // if all elements are negaive
        if(globalCount==0) {
             globalCount= findMin(arr);
        }
        */


