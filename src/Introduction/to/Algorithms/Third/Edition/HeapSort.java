package Introduction.to.Algorithms.Third.Edition;

public class HeapSort {
    public static void MAX_HEAPIFY(int[] A, int i, int n) {
        int left = 2*i+1;
        int right = 2*i+2;
        int max = i;
        if(left < n && A[left] > A[i])
            max = left;
        if(right < n && A[right] > A[max])
            max = right;
        if(max != i) {
            int temp = A[max];
            A[max] = A[i];
            A[i] = temp;
            MAX_HEAPIFY(A, max, n);
        }
    }
    public static void BUILD_MAX_HEAP(int[] A, int n) {
        for(int i = (n-1)/2; i >= 0; i--) {
            MAX_HEAPIFY(A, i, n);
        }
    }
    public static void HEAP_SORT(int[] A) {
        BUILD_MAX_HEAP(A, A.length);
        int n = A.length;
        while(n >= 1) {
            int temp = A[0];
            A[0] = A[n-1];
            A[n-1] = temp;
            n--;
            MAX_HEAPIFY(A, 0, n);
        }
    }
    public static void main(String[] args) {
        int[] A = {6, 10, 13, 5, 8, 3, 2, 11};
        HEAP_SORT(A);
        for(int i = 0; i < 8; i++) {
            System.out.print(A[i]+" ");
        }
    }
}
