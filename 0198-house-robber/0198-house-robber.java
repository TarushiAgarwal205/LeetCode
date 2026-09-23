//time limit exceeded

// class Solution {
//     public int rob(int[] nums) {
//         return hr(nums,nums.length-1);
//     }
//     public static int hr(int[]nums,int i){
//         if(i<0){return 0;}
//     if (end<start){
//     int take=hr(nums,i-2)+nums[end];
//     int notake=hr(nums,i-1);}
//     return Math.max(take,notake);
  class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
     int[] dp = new int[n];
Arrays.fill(dp, -1);
    return helper(nums,n-1,dp);
    
    }
    public static int helper(int[]nums,int i,int[]dp){
//reached the last house hen return 0 no ore moving
if(i<0){
    return 0;
}
//already calculated
if(dp[i]!=-1){
    return dp[i];
}
int take=helper(nums,i-2,dp)+nums[i];
// int nottake=Integer.MIN_VALUE;
// if(i>1){
   int nottake=helper(nums,i-1,dp);
//}
dp[i]=Math.max(take,nottake);
return dp[i];

    }
} 
