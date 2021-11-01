public class SelectionSort {
    public static void main(String[] args) {
       int arr[] = {8, 9, 11, 20, 21};
       sort(arr);
    }

    public static void sort(int arr[]) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {

            int min = i;

            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[i]) {
                    min = j;
                }

                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    for(int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
    }
}