// public class Solution {
//     public void sortColors(int[] nums) {
//         int low = 0, mid = 0;
//         int high = nums.length - 1;

//         while (mid <= high) {
//             switch (nums[mid]) {
//                 case 0: // red
//                     swap(nums, low, mid);
//                     low++;
//                     mid++;
//                     break;
//                 case 1: // white
//                     mid++;
//                     break;
//                 case 2: // blue
//                     swap(nums, mid, high);
//                     high--;
//                     break;
//             }
//         }
//     }

//     private void swap(int[] nums, int i, int j) {
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }

//     // Example usage
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] nums = {2, 0, 2, 1, 1, 0};
//         sol.sortColors(nums);

//         System.out.println(Arrays.toString(nums)); // Output: [0, 0, 1, 1, 2, 2]
//     }
// }
class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // swap low and mid
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else { // nums[mid] == 2
                // swap mid and high
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}