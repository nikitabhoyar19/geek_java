public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {8, 9, 11, 20, 21};
        sort(arr);
     }
 
     public static void sort(int arr[]) {
         int n = arr.length;
 
         for(int i = 0; i < n; i++) {
             for(int j = 0; j < n - i - 1; j++) {
                 if(arr[j] > arr[j + 1]) {

                     int temp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = temp;
                 }
             }
         }
     for(int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
     }
     }
}