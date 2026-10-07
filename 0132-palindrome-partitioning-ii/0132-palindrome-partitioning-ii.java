class Solution {
    public int minCut(String s) {
        int n = s.length();

        // palindrome[i][j] = true if s[i...j] is palindrome
        boolean[][] palindrome = new boolean[n][n];

        // Fill palindrome table
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;

                if (len == 1) {
                    palindrome[i][j] = true;
                }
                else if (len == 2) {
                    palindrome[i][j] = (s.charAt(i) == s.charAt(j));
                }
                else {
                    palindrome[i][j] =
                        (s.charAt(i) == s.charAt(j)) &&
                        palindrome[i + 1][j - 1];
                }
            }
        }

        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return helper(0, s, palindrome, dp);
    }

    public int helper(int start, String s, boolean[][] palindrome, int[] dp) {

        // No characters left -> no cut needed
        if (start == s.length()) {
            return -1;
        }

        if (dp[start] != -1) {
            return dp[start];
        }

        int ans = Integer.MAX_VALUE;

        for (int end = start; end < s.length(); end++) {

            if (palindrome[start][end]) {

                ans = Math.min(
                    ans,
                    1 + helper(end + 1, s, palindrome, dp)
                );
            }
        }

        dp[start] = ans;
        return ans;
    }
}