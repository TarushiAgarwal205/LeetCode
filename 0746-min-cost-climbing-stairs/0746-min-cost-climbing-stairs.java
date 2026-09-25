//by rcursion it is showing tle
// class Solution {

//     public int minCostClimbingStairs(int[] cost) {

//         return Math.min(
//             MCCS(cost, cost.length - 1),
//             MCCS(cost, cost.length - 2)
//         );
//     }

//     public int MCCS(int[] cost, int i) {

//         if (i == 0 || i == 1) {
//             return cost[i];
//         }
// int oneJump=cost[i]+MCCS(cost,i-1);
// int twoJump=cost[i]+MCCS(cost,i-2);
//         // int oneJump = MCCS(cost, i - 1);
//         // int twoJump = MCCS(cost, i - 2);

//         // return cost[i] + Math.min(oneJump, twoJump);
//         return Math.min(oneJump, twoJump);
//     }
// }

//memoization

class Solution {

    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length;

        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return Math.min(helper(cost, n - 1, dp),
                        helper(cost, n - 2, dp));
    }

    public static int helper(int[] cost, int i, int[] dp) {

        if (i == 0 || i == 1) {
            return cost[i];
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int onestep = helper(cost, i - 1, dp) + cost[i];

        int twostep = helper(cost, i - 2, dp) + cost[i];

        dp[i] = Math.min(onestep, twostep);

        return dp[i];
    }
}