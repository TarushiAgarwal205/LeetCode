// class Solution {
//     public int splitArray(int[] nums, int k) {
//         return solve(0,k,nums);

//     }
//     public int solve(int i,int k,int []nums){
//         int n=nums.length;
//         if(k==1){
//             //only one partition left
//             int sum=0;
//             for(int t=i;t<n;t++){
//                 sum+=nums[t];
//             }return sum;

//         }
//         int currSum=0;
//         int result=Integer.MAX_VALUE;
//         for(int j=i;j<=n-k;j++){
// currSum=currSum+nums[j];
// int remainingSum=solve(j+1,k-1,nums);
// int largeSum=Math.max(currSum,remainingSum);
// result=Math.min(largeSum,result);
//         }
//         return result;
//     }
// }

//memoization

class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int[][] dp = new int[n][k + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= k; j++) {
                dp[i][j] = -1;
            }
        }

        return solve(0, k, nums, dp);
    }

    public int solve(int i, int k, int[] nums, int[][] dp) {
        int n = nums.length;

        if (k == 1) {
            int sum = 0;
            for (int t = i; t < n; t++) {
                sum += nums[t];
            }
            return sum;
        }

        if (dp[i][k] != -1) {
            return dp[i][k];
        }

        int currSum = 0;
        int result = Integer.MAX_VALUE;

        for (int j = i; j <= n - k; j++) {
            currSum += nums[j];

            int remainingSum = solve(j + 1, k - 1, nums, dp);

            int largeSum = Math.max(currSum, remainingSum);

            result = Math.min(result, largeSum);
        }

        dp[i][k] = result;
        return dp[i][k];
    }
}
