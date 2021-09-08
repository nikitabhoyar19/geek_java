public class MaximumConsecutive {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1 };
        System.out.println(findConsecutiveMax(arr));
    }

    public static int findConsecutiveMax(int arr[]) {
        int globalCount = 0;
        int localCount = 0;

        for(int i=0;i<arr.length;i++) {
            if(arr[i]==1) {
                localCount+=1;
            }

            if(localCount>=globalCount) {
                globalCount=localCount;
            }

            if(arr[i]==0) {
                localCount=0;
            }
        }

        return globalCount;

    }
}
