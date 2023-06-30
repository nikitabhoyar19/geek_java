class MultiplyTwo {
    public static void main(String args[]) {
        long num = 1;
        for (int i = 0; i < 50; i = i + 1, num = num * 2) {
            System.out.println(num);
        }
    }
}