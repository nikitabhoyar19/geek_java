public class  SortString {
    public static void main(String args[]) {
        String str = "aAsafd$5321";
        System.out.println(sortString(str));
    }

    public static String sortString(String str) {

        char arr[] = str.toCharArray();
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int min = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }

                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

        return arr.toString();
    }
}