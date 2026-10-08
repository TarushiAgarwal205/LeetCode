class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        int[]dp=new int[n];
        Arrays.fill(dp,-1);
        return solve(0,arr,k,dp);
    }
    public static int solve(int i,int []arr,int k,int[]dp)
{
    //base condition
    //when i reached to arr.length
    if(i>=arr.length){
        return 0;
    }
    if(dp[i]!=-1){
        return dp[i];
    }
    int max=-1;
    int  len =0;
    int result=Integer.MIN_VALUE;
    for(int j=i;j<arr.length&&j<i+k;j++){
        max=Math.max(max,arr[j]);
        len=j-i+1;
       int cost=max*len+solve(j+1,arr,k,dp);
    
    result=Math.max(result,cost);
    dp[i]=result;
    }
    return dp[i];

}}