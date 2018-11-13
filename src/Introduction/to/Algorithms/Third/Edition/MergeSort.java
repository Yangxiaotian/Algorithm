package Introduction.to.Algorithms.Third.Edition;

public class MergeSort {
	public static void merge(int[] A, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] L = new int[n1];
		int[] R = new int[n2];
		int i,j;
		for(i = 0; i < n1; i++) L[i] = A[p+i];
		for(j = 0; j < n2; j++) R[j] = A[q+j+1];
		int k = p;
		for(i = 0, j = 0; i < n1 && j < n2; ) {
			if(L[i] < R[j]) {
				A[k++] = L[i++];
			}else {
				A[k++] = R[j++];
			}
		}
		while(i < n1) {
			A[k++] = L[i++];
		}
		while(j < n2) {
			A[k++] = R[j++];
		}
	}
	public static void mergeSort(int[] A, int p, int r) {
		if(p < r) {
			int q = (p+r)/2;
			mergeSort(A, p, q);
			mergeSort(A, q+1, r);
			merge(A, p, q, r);
		}
	}
	public static void main(String[] args) {
		int A[] = new int[50];
		for(int i = 0; i < 50; i++) {
			A[i] = 50-i;
		}
		mergeSort(A, 0, 49);
		for(int i = 0; i < 50; i++) {
			System.out.println(A[i]);
		}
	}
}
