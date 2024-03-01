import java.util.Arrays;

public class maxElementsInArray {

    public static int lenOfLongSubarr(int[] array, int k) {
        int n = array.length;
        int[][] dp = new int[n + 1][k + 1];
        // Initializing with -1 to mark that state is not reachable
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return knapsack(array, n, k, dp);
    }

    public static int knapsack(int[] array, int n, int k, int[][] dp) {
        // Base cases
        if (k == 0) return 0;
        if (n == 0) return -1; // Return -1 if we reach end of array and sum is still not 0

        // If state is already calculated return it
        if (dp[n][k] != -1) return dp[n][k];

        // If current element is greater than sum skip it
        if (array[n - 1] > k)
            return dp[n][k] = knapsack(array, n - 1, k, dp);

        // Try including and excluding current element
        int include = knapsack(array, n - 1, k - array[n - 1], dp);
        int exclude = knapsack(array, n - 1, k, dp);

        // Take maximum of including and excluding
        if (include != -1 && exclude != -1)
            return dp[n][k] = Math.max(include + 1, exclude);
        else if (include != -1)
            return dp[n][k] = include + 1;
        else if (exclude != -1)
            return dp[n][k] = exclude;
        else
            return dp[n][k] = -1;
    }

    public static void main(String[] args) {
        // Test cases
        int[] array1 = {6, 2, 2, 3, 4, 1};
        int k1 = 8;
        System.out.println("Maximum number of elements whose sum is exactly " + k1 + ": " + lenOfLongSubarr(array1, k1) + ", Answer is 4");

        int[] array2 = {2, 4, 6, 8};
        int k2 = 5;
        System.out.println("Maximum number of elements whose sum is exactly " + k2 + ": " + lenOfLongSubarr(array2, k2) + ", Answer is -1");

        int[] array3 = {3, 5, 7, 9};
        int k3 = 10;
        System.out.println("Maximum number of elements whose sum is exactly " + k3 + ": " + lenOfLongSubarr(array3, k3) + ", Answer is 2");

        int[] array4 = {10, 20, 30, 30, 5, 5, 5, 5, 5};
        int k4 = 25;
        System.out.println("Maximum number of elements whose sum is exactly " + k4 + ": " + lenOfLongSubarr(array4, k4) + ", Answer is 5");
    }
}
