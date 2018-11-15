package Introduction.to.Algorithms.Third.Edition;

public class ReverseOrderPairCounter {
	public static int merge(int[] A, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] L = new int[n1];
		int[] R = new int[n2];
		int i,j;
		for(i = 0; i < n1; i++) L[i] = A[p+i];
		for(j = 0; j < n2; j++) R[j] = A[q+j+1];
		int k = p;
		for(i = 0, j = 0; i < n1 && j < n2; ) {
			if(L[i] <= R[j]) {
				A[k++] = L[i++];
			}else {
				A[k++] = R[j++];
			}
		}
		int counter = j*(n1-i);
		while(i < n1) {
			A[k++] = L[i++];
		}
		while(j < n2) {
			A[k++] = R[j++];
		}
		return counter;
	}
	public static int mergeSort(int[] A, int p, int r) {
		int sum = 0;
		if(p < r) {
			int q = (p+r)/2;
			sum += mergeSort(A, p, q);
			sum += mergeSort(A, q+1, r);
			sum += merge(A, p, q, r);
		}
		return sum;
	} 
	
	public static int insertSort(int[] A) {
		int n = A.length;
		int counter = 0;
		for(int i = 1; i < n; i++) {
			int key = A[i];
			int j = i - 1;
			while(j >= 0 && key < A[j]) {
				A[j+1] = A[j];
				j--;
				counter++;
			}
			A[j+1] = key;
		}
		return counter;
	}
	public static void main(String[] args) {
		int n = 100000;
		int[] A = new int[n];
		for(int i = 0; i < n; i++) {
			A[i] = n - i;
		}
		long t1 = System.currentTimeMillis();
		System.out.println(mergeSort(A, 0, n-1));
//		System.out.println(insertSort(A));
		long t2 = System.currentTimeMillis();
		System.out.println("cost:"+(t2-t1)/1000.0+"s");
		
		
	}
}
