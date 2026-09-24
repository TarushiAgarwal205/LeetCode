// class Solution {

//     public int rob(int[] nums) {

//         int n = nums.length;

//         if (n == 1) {
//             return nums[0];
//         }

//         return Math.max(
//             hr(nums, 1, n - 1),
//             hr(nums, 0, n - 2)
//         );
//     }

//     public static int hr(int[] nums, int start, int end) {

//         if (end < start) {
//             return 0;
//         }

//         int take = nums[end] + hr(nums, start, end - 2);

//         int nottake = hr(nums, start, end - 1);

//         return Math.max(take, nottake);
//     }
// }


//memoization
class Solution {

    public int rob(int[] nums) {

        int n=nums.length;

        int[]dp1=new int[n];
        Arrays.fill(dp1,-1);

    int[]dp2=new int[n];
        Arrays.fill(dp2,-1);

   if(n==1){
return nums[0];
}

    return Math.max(helper(nums,0,n-2,dp1),helper(nums,1,n-1,dp2));
   
    }public static int helper(int[]nums,int start,int end,int[]dp) {

  
if(start>end){
    return 0;
}
if(dp[start]!=-1){
    return dp[start];
}
int take=helper(nums,start+2,end,dp)+nums[start];
int nottake=helper(nums,start+1,end,dp);

dp[start]= Math.max(take,nottake);
    return dp[start];
    }
}












 