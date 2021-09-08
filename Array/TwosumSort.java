public class TwosumSort {
    public static void main(String args[]) {
        int arr[] = { 1, 4, 5, 8, 10, 15, 19, 20 };
        int sum = 21;
        int start = 0;
        int end = arr.length - 1;
        boolean isAnsFound = false;
        while (start < end) {
            if (sum < arr[start] + arr[end]) {
                start++;
            }

            else if (sum > arr[start] + arr[end]) {
                end++;
            }

            else {
                isAnsFound = true;
                break;
            }

        }

        if (isAnsFound == true) {
            System.out.println("Ans is Found");
        }

        else {
            System.out.println("Not Found");
        }

    }
}