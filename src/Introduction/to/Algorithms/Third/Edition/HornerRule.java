package Introduction.to.Algorithms.Third.Edition;

public class HornerRule {
	public static double hornerRule(double[] A, double x) {
		double y = 0;
		int n = A.length - 1;
		while(n >= 0) {
			y = x*y + A[n];
			n--;
		}
		return y;
	}
	public static void main(String[] args) {
		double A[] = {1, 2, 3, 4};
		double x = 2;
		System.out.println(hornerRule(A, x));
	}
}
