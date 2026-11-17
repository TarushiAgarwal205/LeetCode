class Solution {
    public int removeElement(int[] nums, int val) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            if(nums[left]==val&&nums[right]!=val){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
              
                left++;
                right--;
            }

            else if(nums[left]!=val){
                left++;
            }
            else if(nums[right]==val){
                right--;
            }
        }
        return left;
    }
}