// class Solution {
//   public int removeDuplicates(int[] nums) {
//     int i = 0;

//     for (final int num : nums)
//       if (i < 1 || num > nums[i - 1])
//         nums[i++] = num;

//     return i;
//   }
// }
class Solution{
    public int removeDuplicates(int[] nums){
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];}}
                return i+1;
            }
        }
    
