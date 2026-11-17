// class Solution {
//     public void moveZeroes(int[] nums) {
//         // int insertPos = 0;

        
//         // for (int num : nums) {
//         //     if (num != 0) {
//         //         nums[insertPos++] = num;
//         //     }
//         // }

        
//         // while (insertPos < nums.length) {
//         //     nums[insertPos++] = 0;
//         // }
//         int n=arrlength;
//         int j=0;
//         for(int i=0;i<n;i++){
//             if(arr[i]!=0){
//                 if(i!=j){
//                     int temp=arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp;
//                 }
//             }
//         }
//     }
// }
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                if (i != j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++;  // IMPORTANT
            }
        }
    }
}
