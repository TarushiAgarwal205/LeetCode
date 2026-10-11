// class Solution {
//   public int maxSubArray(int[] nums) {
//     // dp[i] := the maximum sum subarray ending in i
//     int[] dp = new int[nums.length];

//     dp[0] = nums[0];
//     for (int i = 1; i < nums.length; ++i)
//       dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);

//     return Arrays.stream(dp).max().getAsInt();
//   }
// }

//TLE
// class Solution {
//   public int maxSubArray(int[] nums) {
//     return maximumSum(nums);}
//      public static int maximumSum(int[]arr){
//         int ans=Integer.MIN_VALUE;
//         for(int i=0;i< arr.length;i++){
//             int sum=0;
//             for(int j=i;j< arr.length;j++){
//                 sum+=arr[j];
//                 ans=Math.max(ans,sum);
//             }
//         }
//         return ans;}}
//recursion

// class Solution {
//     public int maxSubArray(int[] nums) {
//         return helper(nums, nums.length - 1);
//     }

//     public static int helper(int[] nums, int i) {
//         if (i == 0) {
//             return nums[0];
//         }

//         int extend = nums[i] + Math.max(0, helper(nums, i - 1));

//         int previous = helper(nums, i - 1);

//         return Math.max(extend, previous);
//     }
// }


class Solution {
    public int maxSubArray(int[] nums) {
 int ans=Integer.MIN_VALUE;
 int sum=0;
 for(int i=0;i<nums.length;i++){
    
    sum+=nums[i];
ans=Math.max(ans,sum);
if(sum<0){
   sum=0;
}}
 return ans;
    }
}

 