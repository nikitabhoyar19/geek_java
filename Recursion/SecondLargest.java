public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {5,7,8,9,16, 20, 5, 19};
        System.out.println(findSecondLargeElement(arr));
    }

    public static int findSecondLargeElement(int arr[]) {
        int large = arr[0];
        int secondLarge = -1;

        for(int i=0;i<arr.length;i++) {
            for(int j=1;j<arr.length;j++) {
                if(arr[j]>arr[i]) {
                    secondLarge=large;
                    large=arr[j];
                }
            }
        }
        return secondLarge;
    }
}