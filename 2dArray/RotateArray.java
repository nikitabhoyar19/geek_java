public class RotateArray {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        rotate(matrix);
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix.length;j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }

    public static void rotate(int[][] matrix) {
        transpose(matrix);
        reflect(matrix);
    }

    public static void transpose(int matrix[][]) {
        int n = matrix.length;
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                int temp= matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
    
    public static void reflect(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = tmp;
            }
        }
    }
}
