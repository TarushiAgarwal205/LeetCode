// class Solution {
//     public int numDecodings(String s) {
//         return helper(s,0);
//     }
//     public static int helper(String s,int i){
//         //base case
//         if(i==s.length()){
//             return 1;
//         }
//         if(s.charAt(i)=='0'){
//             return 0;
//         }
//         int oneDigit=helper(s,i+1);
//         int twoDigit=0;
//         if(i+1<s.length()){
//             int num=Integer.parseInt(s.substring(i,i+2));
        
//         if(num>=10&&num <=26){
//             twoDigit=helper(s,i+2);
//         }
//          }
//         return oneDigit+twoDigit;
//     }
// }

//memoization
class Solution {
    public int numDecodings(String s) {
       int n=s.length();
       int[]dp=new int[n];
       Arrays.fill(dp,-1);
        return helper(s,0,dp);
    }
    public static int helper(String s,int i,int[]dp){
        //base case
        if(i==s.length()){
            return 1;
        }
        if(s.charAt(i)=='0'){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int oneDigit=helper(s,i+1,dp);
        int twoDigit=0;
        if(i+1<s.length()){
            int num=Integer.parseInt(s.substring(i,i+2));
        
        if(num>=10&&num <=26){
            twoDigit=helper(s,i+2,dp);
        }
         }
        dp[i]= oneDigit+twoDigit;
    return dp[i];
    }
}