package Introduction.to.Algorithms.Third.Edition;

public class StrassenMatrixMultiply {
    public static int[][] SQUARE_MATRIX_MULTIPLY(int[][] A, int[][] B, int n) {
        int[][] C = new int[n][n];
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                C[i][j] = 0;
                for(int k = 1; k <= n; k++) {
                    C[i][j] += A[i][k]*B[k][j];
                }
            }
        }
        return C;
    }

    public static int[][] SQUARE_MATRIX_MULTIPLY_RECURSIVE(int[][] A, int[][] B, int n) {
        int[][] C = new int[n][n];
        return null;
    }
}
