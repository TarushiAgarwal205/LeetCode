// // recursion time limit exceeded
// class Solution {
//     public int uniquePaths(int m, int n) {
//         return helper(m - 1, n - 1);
//     }

//     public int helper(int i, int j) {

//         // Outside the grid
//         if (i < 0 || j < 0) {
//             return 0;
//         }

//         // Reached starting point
//         if (i == 0 && j == 0) {
//             return 1;
//         }

//         // Come from above
//         int up = helper(i - 1, j);

//         // Come from left
//         int left = helper(i, j - 1);

//         return up + left;
//     }
// }
//memoization

class Solution {

    public int uniquePaths(int m, int n) {

        int dp[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        return helper(m - 1, n - 1, dp);
    }

    public int helper(int i, int j, int[][] dp) {

        if (i == 0 && j == 0) {
            return 1;
        }

        if (i < 0 || j < 0) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int up = helper(i - 1, j, dp);
        int left = helper(i, j - 1, dp);

        dp[i][j] = up + left;

        return dp[i][j];
    }
}



//    //tabulation

// int[][] dp=new int[m][n];
// dp[0][0]=1;
// for(int i=0;i<m;i++){
//     for(int j=0;j<n;j++){
//         if(i==0&&j==0){continue;}
//         int up=0;
//     if(i>0)
// {
// up=dp[i-1][j];
// }    
// int left=0;
// if(j>0){
//     left=dp[i][j-1];}

//     dp[i][j]=left+up;
// 
    
    //return dp[m-1][n-1];
//     }
// }





























