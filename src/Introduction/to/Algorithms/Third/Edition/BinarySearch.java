package Introduction.to.Algorithms.Third.Edition;

public class BinarySearch {
	public static int binarySearch(int[] A, int key, int p, int r) {
		if(p <= r) {
			int q = (p+r)/2;
			if(key == A[q]) return q;
			else if(key < A[q]) return binarySearch(A, key, p, q-1);
			else return binarySearch(A, key, q+1, r);
		}else {
			return -1;
		}
	}
	/**
	 * 不用递归的二叉查找
	 * @param args
	 */
	public static int binarySearchLoop(int[] A, int key, int p, int r) {
		while(p <= r) {
			int q = (p + r)/2;
			if(key == A[q]) return q;
			else if(key < A[q]) r = q -1;
			else p = q + 1;
		}
		return -1;
	}
	public static void main(String[] args) {
//		int[] A = new int[50];
//		for(int i = 0; i < 50; i++)
//			A[i] = 50-i;
//		MergeSort.mergeSort(A, 0, 49);
		int[] A = {1, 3, 4, 6};
		System.out.println(binarySearchLoop(A, 4, 0, 3));
	}
}
