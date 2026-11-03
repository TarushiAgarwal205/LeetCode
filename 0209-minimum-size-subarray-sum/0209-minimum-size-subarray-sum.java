class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int left=0;
        int right=0;
        int minW=Integer.MAX_VALUE;
        int sum=0;
        for(right=0;right<arr.length;right++){
            sum=sum+arr[right];
            while(sum>=target){
                  minW=Math.min(minW,right-left+1);
                sum=sum-arr[left];
                left++;
            
          }
        }
             return minW == Integer.MAX_VALUE ? 0 : minW;
    }
}