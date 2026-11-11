class Solution {
    public int trap(int[] height) {
        return Trap(height);
    }
      public static int Trap(int[]arr){
        int n= arr.length;
        //prfix max
        int[]left=new int[n];
        left[0]=arr[0];
        for(int i=1;i<left.length;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        //Suffix max
        int[]right=new int[n];
        right[n-1]=arr[n-1];
        for (int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);;
        }
        //answer calculate
        int ans=0;
        for(int i=0;i<n;i++){
        ans+=Math.min(left[i],right[i])-arr[i];
    }
    return ans;}
}

