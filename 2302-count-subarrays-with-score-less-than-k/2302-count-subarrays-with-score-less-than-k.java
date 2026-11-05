class Solution {
    public long countSubarrays(int[] nums, long k) {
        int left=0;
        long count=0;
        long sum=0;
        long score=0;
        
        for(int right=0;right<nums.length;right++){
       sum=sum+nums[right];
       score=sum*(right-left+1L);
       while(score>=k){
        sum=sum-nums[left];
        left++;
        score=sum*(right-left+1L);
       
       }
       count=count+(right-left+1L);
       
        }
        return count;
    }
}