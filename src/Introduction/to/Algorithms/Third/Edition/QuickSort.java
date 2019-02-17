package Introduction.to.Algorithms.Third.Edition;

public class QuickSort {
    public static int partition(int[] A, int p, int r) {
        int x = A[p];
        int i = p;
        for(int j = p+1; j <= r; j++) {
            if (A[j] < x) {
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i];
        A[i] = A[p];
        A[p] = temp;
        return i;
    }
    public static void quickSort(int[] A, int p, int r) {
        if(p < r) {
            int q = partition(A, p, r);
            quickSort(A, p, q-1);
            quickSort(A, q+1, r);
        }
    }
    public static void main(String[] args) {
        int[] A = {6, 10, 13, 5, 8, 3, 2, 11};
        quickSort(A, 0, 7);
        for(int i = 0; i < 8; i++) {
            System.out.print(A[i]+" ");
        }
    }
}
