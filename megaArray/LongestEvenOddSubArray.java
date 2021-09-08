public class LongestEvenOddSubArray {
    public static void main(String[] args) {
        System.out.println(findLongestEvenOddSubArray(new int[] { 6, 1, 11, 12, 3, 5, 6, 7, 9, 10, 7, 2 }));
    }

    public static int findLongestEvenOddSubArray(int arr[]) {

        // this is base case
        int longOne = 1;
        int finalOne = 1;

        for (int i = 1; i < arr.length; i++) {
            if (((arr[i] % 2 == 0) && (arr[i - 1] % 2 != 0)) || ((arr[i] % 2 != 0) && (arr[i - 1] % 2 == 0))) {
                longOne++;
                finalOne = Math.max(longOne, finalOne);
            } else {
                longOne = 1;
            }

        }

        return finalOne;

    }
}
