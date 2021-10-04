public class GridUniquePath{
    public static void main(String[] args) {
        System.out.println(countPaths(0, 0, 2, 1));
    }

    public static int countPaths(int i, int j, int n, int m) {
        if(i == (n - 1) && j == (m - 1)) return 1;
        else if(i >= n || j >= m) return 0;
        return countPaths(i+1,j, 2, 1) + countPaths(i, j+1, 2, 1);
    }
}