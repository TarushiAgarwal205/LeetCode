// //greedy
// // class Solution {
// //     public boolean canJump(int[] nums) {
// //        int n=nums.length;
// //         int maxreach=0;
        
// //         for(int i=0;i<n;i++){
// //             if(i>maxreach){
// //                 return false;
// //             }    
// //             maxreach=Math.max(maxreach,i+nums[i]);

// //         }
// //         return true;
// //     }
// // }
// //recursion
// class Solution {
//     public boolean canJump(int[] nums) {
      
//  return helper(nums,0);
//     }
//     public static boolean helper(int[]nums,int i){
//         if(i>=nums.length-1){//reached or exceeded the last index
//             return true;
//         }
//         //this k here is the no. of jumps we can take maximum that is if no.of jumps is 2 then k=1 then k=2 jump will occur and from these two paths will be decided
//         for(int k=1;k<=nums[i];k++){
        
//             boolean jump=helper(nums,i+k);
//             //here we used if(jump) because it is possible like in first testcase that we rech last index in first attempt
//             //or in the second or third attempt then return true in between no need to check for other possbilites

//        if(jump){
//         return true;
//        }
//         }
//         return false;

//     }
// } 

//memoization
//as it is 1 d array and it only depends on i th index because it is the only one that changes and matters that 
//if we  have reached the last index or not 
class Solution {
    public boolean canJump(int[] nums) {
      boolean[]dp=new boolean[nums.length];
//       Arrays.fill(dp,false);
//         // dp stores the output/answer for that index.
// visited stores whether we have already calculated that index.
// Because of visited, we don't call the same recursive calculation again, which reduces time.

// So:

// visited[i] → "Have I solved i before?"
// dp[i]      → "What was the answer for i?"

// Then:

// visited[i] == true
//         ↓
// don't call recursion again
//         ↓
// just return dp[i]   
    boolean visited[]=new boolean[nums.length];
    Arrays.fill(visited,false);
 return helper(nums,0,dp,visited);
    }
    public static boolean helper(int[]nums,int i,boolean[]dp,boolean []visited){
        if(i>=nums.length-1){//reached or exceeded the last index
            return true;
   
        }
        if(visited[i]!=false){
            return dp[i];
        }
        //this k here is the no. of jumps we can take maximum that is if no.of jumps is 2 then k=1 then k=2 jump will occur and from these two paths will be decided
        for(int k=1;k<=nums[i];k++){
        
            boolean jump=helper(nums,i+k,dp,visited);
            //here we used if(jump) because it is possible like in first testcase that we rech last index in first attempt
            //or in the second or third attempt then return true in between no need to check for other possbilites

       if(jump){
        
         dp[i] = true;
                visited[i] = true;
                return true;
      
       }
        }
        // No jump can reach the end
        dp[i] = false;
        visited[i] = true;

        return false;

    }
} 