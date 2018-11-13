package Introduction.to.Algorithms.Third.Edition;

public class InsertSort {
	public static void insertSort(int[] A) {
		for(int j = 1; j < A.length; j++) {
			int key = A[j];
			int i = j - 1;
			while(i >= 0 && A[i] > key) {
				A[i+1] = A[i];
				i--;
			}
			A[i+1] = key;
		}
	}
	public static void main(String[] args) {
		int A[] = new int[50];
		for(int i = 0; i < 50; i++) {
			A[i] = 50-i;
		}
		insertSort(A);
		for(int i = 0; i < 50; i++) {
			System.out.println(A[i]);
		}
	}
}
