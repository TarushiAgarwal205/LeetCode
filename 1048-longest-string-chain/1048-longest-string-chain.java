class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b)->a.length()-b.length());//word length wise sort
        int maxlen=0;
        int n=words.length;
        int []dp=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(isPred(words[j],words[i])){
                    dp[i]=Math.max(dp[i],1+dp[j]);
                }
            }
            maxlen=Math.max(dp[i],maxlen);
        }
        return maxlen;


    }
    public boolean isPred(String a,String b){
        int m=a.length();
        int n=b.length();
    if(n-m!=1){
        return false;
    }
    int i=0;int j=0;
    while(i<m&&j<n){
        if(a.charAt(i)==b.charAt(j)){
            i++;
        }
        j++;
    }
    
return i==a.length();
}
}