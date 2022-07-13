
class Day1_kadaneAlgorithm {

    public static void maxSubArraySum(int[] a) {
        int n = a.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            currSum += a[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println(maxSum);

    }

    public static void main(String[] args) {
        int[] a = { -2, 3, -1, 2 };
        maxSubArraySum(a);
    }

}
