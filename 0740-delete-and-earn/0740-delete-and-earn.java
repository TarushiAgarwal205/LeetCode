// class Solution {
//     public int deleteAndEarn(int[] nums) {
//         int[]freq=new int[10001];
//         for(int i=0;i<nums.length;i++){
//             freq[nums[i]]++;
//         }
//         return helper(nums,10000,freq);

//     }
//     public static int helper(int []nums,int i,int []freq){
//         if(i<0){
//             return 0;
//         }
//         int take=helper(nums,i-2,freq)+i*freq[i];
//         int skip=helper(nums,i-1,freq);

//         return Math.max(take,skip);

//     }
// }


//memoization
class Solution {
    public int deleteAndEarn(int[] nums) {
        int[]dp=new int [10001];
        Arrays.fill(dp,-1);
        int[]freq=new int[10001];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        return helper(nums,10000,freq,dp);

    }
    public static int helper(int []nums,int i,int []freq,int[]dp){
        if(i<0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int take=helper(nums,i-2,freq,dp)+i*freq[i];
        int skip=helper(nums,i-1,freq,dp);

        dp[i]= Math.max(take,skip);
return dp[i];
    }
}