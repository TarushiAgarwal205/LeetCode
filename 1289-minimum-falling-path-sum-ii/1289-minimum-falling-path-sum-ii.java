// class Solution {
//     public int minFallingPathSum(int[][] matrix) {
//             int n = matrix.length;
//   int ans = Integer.MAX_VALUE;
//      // Start from every column of the last row
//         for (int j = 0; j < n; j++) {
//            ans = Math.min(ans, helper(matrix, n - 1, j));
//         }
//         return ans;
//     }
//     public static int helper(int[][]matrix,int i,int j){
//               //array out of index 
//            if (j < 0 || j >= matrix.length) {
//     return Integer.MAX_VALUE;
// }
// //if comes to the last row
// if(i==0){
//     return matrix[i][j];
// }
// int ans=Integer.MAX_VALUE;
// for(int k=0;k<matrix.length;k++){
// while( k!=j)
//  ans=matrix[i][j]+Math.min(ans,helper(matrix,i-1,j));}
// // int x=helper(matrix,i-1,j-1);
// // int y=helper(matrix,i-1,j-2);
// // int z=helper(matrix,i-1,j+1);
// // int l=helper(matrix,i-1,j+2);

// return ans;
//     }
// }
class Solution {
    public int minFallingPathSum(int[][] matrix) {
            int n = matrix.length;
            int m=matrix[0].length;
            int[][]dp=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    dp[i][j]=-1;
                }
            }
            
  int ans = Integer.MAX_VALUE;
     // Start from every column of the last row
        for (int j = 0; j < matrix.length; j++) {
           ans = Math.min(ans, helper(matrix, matrix.length - 1, j,dp));
        }
        return ans;
    }
    public static int helper(int[][]matrix,int i,int j,int[][]dp){
              //array out of index 
           if (j < 0 || j >= matrix.length) {
    return Integer.MAX_VALUE;
}
//if comes to the last row
if(i==0){
    return matrix[i][j];
}
if(dp[i][j]!=-1){
    return dp[i][j];
}
int ans = Integer.MAX_VALUE;

for(int k = 0; k < matrix.length; k++) {

    if(k != j) {
        ans = Math.min(ans, helper(matrix, i - 1, k, dp));
    }
}

ans = matrix[i][j] + ans;

dp[i][j] = ans;

return ans;
    }
}