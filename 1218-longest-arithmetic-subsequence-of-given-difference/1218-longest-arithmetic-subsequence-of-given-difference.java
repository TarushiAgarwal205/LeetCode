class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        //in tabulation its complexity is O(n^2)
        //and n=10^5 so n^2is 10^10 which exceeds time limit so even by tabulation dp it will give tle
        //so we will use hashmap because now complexity is O(n)
        //now my hashmap
        int maxlen=1;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
int prev=num-difference;
map.put(num,map.getOrDefault(prev,0)+1);//here map.get means ki hume voh uss key par kya value hai vo dega but default matlab kuch nhi hoga toh 0 denge
maxlen=Math.max(maxlen,map.get(num));
        }
        return maxlen;
    }
}