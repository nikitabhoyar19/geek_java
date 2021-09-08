public class TrappingRainWater {
    public static void main(String args[]) {
        System.out.println(trapwater(new int[] { 3, 0, 2, 0, 4 }));
    }

    public static int trapwater(int arr[]) {
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];

        left[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }

        right[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            left[i] = Math.max(right[i + 1], arr[i]);
        }

        int water = 0;
        for (int i = 0; i < arr.length; i++) {
            left[i] = Math.min(left[i], right[i] - arr[i]);
        }
        return water;
    }
}