package Introduction.to.Algorithms.Third.Edition;

public class BubbleSort {
	//大学学C语言时交的, 其实叫沉底排序
	public static void bubbleSrotFromCollege(int[] A) {
		int n = A.length;
		for(int i = 0; i < n-1; i++) 
			for(int j = 0; j < n-i-1; j++)
				if(A[j+1] < A[j]) {
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
	}
	//算法导论里的
	public static void bubbleSort(int[] A) {
		int n = A.length;
		for(int i = 0; i < n-1; i++)
			for(int j = n-1; j > i; j--)
				if(A[j-1] > A[j]) {
					int temp = A[j];
					A[j] = A[j-1];
					A[j-1] = temp;
				}
	}
	public static void main(String[] args) {
		int A[] = new int[50];
		for(int i = 0; i < 50; i++) {
			A[i] = 50-i;
		}
//		bubbleSrotFromCollege(A);
		bubbleSort(A);
		for(int i = 0; i < 50; i++) {
			System.out.println(A[i]);
		}
	}
}
