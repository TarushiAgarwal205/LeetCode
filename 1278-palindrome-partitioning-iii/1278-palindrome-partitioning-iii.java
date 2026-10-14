
import java.util.Arrays;

class Solution {
    public int palindromePartition(String s, int k) {
        int n = s.length();

        int[][] cost = new int[n][n];

        // Calculate the cost of making each substring a palindrome
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;

                cost[i][j] = cost[i + 1][j - 1];

                if (s.charAt(i) != s.charAt(j)) {
                    cost[i][j]++;
                }
            }
        }

        int[][] dp = new int[n][k + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return helper(0, k, n, cost, dp);
    }

    public int helper(int i, int k, int n,
                      int[][] cost, int[][] dp) {

        if (n - i == k) {
            return 0;
        }

        if (k == 1) {
            return cost[i][n - 1];
        }

        if (dp[i][k] != -1) {
            return dp[i][k];
        }

        int ans = Integer.MAX_VALUE;

        // Leave at least k-1 characters for remaining partitions
        for (int j = i; j <= n - k; j++) {
            int currentCost = cost[i][j]
                    + helper(j + 1, k - 1, n, cost, dp);

            ans = Math.min(ans, currentCost);
        }

        return dp[i][k] = ans;
    }
}
