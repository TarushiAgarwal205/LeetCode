class Solution {
    public int majorityElement(int[] nums) {
        return MooreVoting(nums);}

//         int n = nums.length;

//         for(int i = 0; i < n; i++){
//             int count = 0;

//             for(int j = 0; j < n; j++){
//                 if(nums[i] == nums[j])
//                     count++;
//             }

//             if(count > n/2)
//                 return nums[i];
//         }

//         return -1; 
//     }
//  } //it ran

// import java.util.*;

// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         return nums[nums.length / 2];
//     }
// }
    public static int MooreVoting(int[]arr){
        int e=arr[0];
        int vote =1;
        for(int i=1;i< arr.length;i++){
            if(arr[i]==e){
                vote++;
            }
            else{
                vote--;
            }
            if(vote==0){
                vote=1;
                e=arr[i];
            }
        }
        return e;}}