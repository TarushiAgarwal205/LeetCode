//Recursion
// class Solution {
//     public int jump(int[] nums) {
//         return helper(nums,0);
//     }
//     public static int helper(int[]nums,int i){
//         if(i==nums.length-1){
//             return 0;
//         }

//         int ans=Integer.MAX_VALUE;
// for(int j=1;j<=nums[i];j++){
//     if(i+j<nums.length){
//          int result=helper(nums,i+j);
//         if(result!=Integer.MAX_VALUE){
//             int jump=result+1;
//    ans= Math.min(ans,jump);}
//     }
// }
// return ans;
//     }
// }

// Memoization
class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return helper(nums, 0, dp);
    }

    public static int helper(int[] nums, int i, int[] dp) {
        if (i == nums.length - 1) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }

        int ans = Integer.MAX_VALUE;
        for (int j = 1; j <= nums[i]; j++) {
            if (i + j < nums.length) {
                int result = helper(nums, i + j, dp);
                if (result != Integer.MAX_VALUE) {
                    int jump = result + 1;
                    ans = Math.min(ans, jump);
                   
                }}
            }
             dp[i] = ans;
        
        return dp[i];
    }
}