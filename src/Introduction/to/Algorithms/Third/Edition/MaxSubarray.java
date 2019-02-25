package Introduction.to.Algorithms.Third.Edition;

public class MaxSubarray {
    static class Subarray {
        int low;
        int high;
        int sum;
    }

    public static Subarray findCrossingMaxSubarray(int[] A, int low, int mid, int high) {
        Subarray leftSubarray = new Subarray();
        Subarray rightSubarray = new Subarray();

        int left = mid;
        int right = mid + 1;
        leftSubarray.low = left;
        leftSubarray.sum = A[left];
        int sumLeft = A[left--];
        int sumRight = A[right++];
        rightSubarray.sum = sumRight;
        rightSubarray.high = right;
        while (left >= low) {
            sumLeft += A[left];
            if(sumLeft > leftSubarray.sum) {
                leftSubarray.sum = sumLeft;
                leftSubarray.low = left;
            }
            left--;
        }
        while (right <= high) {
            sumRight += A[right];
            if (sumRight > rightSubarray.sum) {
                rightSubarray.sum = sumRight;
                rightSubarray.high = right;
            }
            right++;
        }
        Subarray maxCrossingSubarray = new Subarray();
        maxCrossingSubarray.sum = leftSubarray.sum + rightSubarray.sum;
        maxCrossingSubarray.low = leftSubarray.low;
        maxCrossingSubarray.high = rightSubarray.high;
        return maxCrossingSubarray;
    }

    public static Subarray findMaxSubarray(int[] A, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            Subarray leftSubarray = findMaxSubarray(A, low, mid);
            Subarray crossSubarray = findCrossingMaxSubarray(A, low, mid, high);
            Subarray rightSubarray = findMaxSubarray(A, mid+1, high);
            if(leftSubarray.sum >= crossSubarray.sum && leftSubarray.sum >= rightSubarray.sum) {
                return leftSubarray;
            }else if(rightSubarray.sum >= crossSubarray.sum && rightSubarray.sum >= leftSubarray.sum) {
                return rightSubarray;
            }else {
                return crossSubarray;
            }

        } else  {
            Subarray sub = new Subarray();
            sub.low = low;
            sub.high = high;
            sub.sum = A[low];
            return sub;
        }
    }
    public static Subarray fun(){
        Subarray sub = new Subarray();
        sub.low = 1;
        sub.high = 100;
        sub.sum = 1000;
        return sub;
    }
    public static void main(String[] args) {
        int[] A = new int[]{13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
        Subarray sub = findMaxSubarray(A, 0, 15);
        System.out.println(sub.low+"\t"+sub.high+"\t"+sub.sum);
    }

}
