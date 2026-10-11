class Solution {
    public String reverseWords(String s) {
             s=s.trim();//this method removes leading and trailing spaces are removed
//        String []arr=s.split("s");//splitting humesha array mai store hota hai//[the   , ky     i,  blue]
        String []arr=s.split(" +");//[the, sky, is, blue]with this extra spaces in between are handled
        //System.out.println(Arrays.toString(arr));
        String ans="";
        for(int i=arr.length-1;i>=0;i--){
            ans=ans+arr[i]+" ";
        }
        ans=ans.trim();
        return ans;
    }
}