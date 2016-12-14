import java.math.BigInteger;

public class Solution {

    private static BigInteger sub = BigInteger.ZERO;
    private static BigInteger sum = BigInteger.ZERO;
    private static BigInteger left = BigInteger.ZERO;
    private static BigInteger right = BigInteger.ZERO;

    public static void main(String[] args) throws Exception {
        Solution s = new Solution();

        int[] A = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(s.solution(A));

    }

    public int solution(int[] A) {

        sum = BigInteger.ZERO;
        if (A.length != -1 ) {
            sum = sum.add(sumOfSubArray(A));
        }

        for (int i=0; i<A.length; i++) {
            sub = sub.add(BigInteger.valueOf(A[i]));

            left = sub.subtract(BigInteger.valueOf(A[i]));
            right = sum.subtract(sub);

            if ( left.equals(right)) {
                return i;
            }
        }

        return -1;
    }

    public static BigInteger sumOfSubArray(int[] a) {
        BigInteger sum = BigInteger.ZERO;

        for (int i = 0; i < a.length; i++) {
            sum = sum.add(BigInteger.valueOf(a[i]));
        }

        return sum;
    }
}