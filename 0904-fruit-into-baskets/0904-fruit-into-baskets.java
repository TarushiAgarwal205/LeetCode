class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        int max=0;
        for(int right=0;right<fruits.length;right++){
            //add current fruit to map
map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
//shrinking size if baskets are more than 2
while(map.size()>2){
    map.put(fruits[left],map.get(fruits[left])-1);
    if(map.get(fruits[left])==0){
        map.remove(fruits[left]);
    }
    left++;
}
//update maximum window size
max=Math.max(max,right-left+1);
        }
        return max;
    }
}