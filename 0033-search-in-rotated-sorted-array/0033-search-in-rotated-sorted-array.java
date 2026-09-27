class Solution {
    public int search(int[] arr, int target) {
    //     int low = 0, high = nums.length - 1;

    //     while (low <= high) {
    //         int mid = low + (high - low) / 2;

    //         if (nums[mid] == target) {
    //             return mid; // target found
    //         }

    //         // Check if left half is sorted
    //         if (nums[low] <= nums[mid]) {
    //             // Target lies in left half
    //             if (nums[low] <= target && target < nums[mid]) {
    //                 high = mid - 1;
    //             } else {
    //                 low = mid + 1;
    //             }
    //         }
    //         // Otherwise, right half must be sorted
    //         else {
    //             if (nums[mid] < target && target <= nums[high]) {
    //                 low = mid + 1;
    //             } else {
    //                 high = mid - 1;
    //             }
    //         }
    //     }
    //     return -1; // not found
    // }

    // // Testing
    // public static void main(String[] args) {
    //     Solution sol = new Solution();
    //     int[] nums1 = {4,5,6,7,0,1,2};
    //     System.out.println(sol.search(nums1, 0)); // Output: 4

    //     int[] nums2 = {4,5,6,7,0,1,2};
    //     System.out.println(sol.search(nums2, 3)); // Output: -1

    //     int[] nums3 = {1};
    //     System.out.println(sol.search(nums3, 0)); // Output: -1
          int low=0;
        int high= arr.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
             if(arr[low]<=arr[mid]) {//upper line mai hu
                 if (arr[low] <= target && arr[mid] > target) {
                     high = mid - 1;

                 } else {//lower line par hu

                     low = mid + 1;
                 }}else {
                 if(arr[high] >= target && arr[mid]<target){
                     low = mid + 1;
                 }
                 else {
                     high = mid - 1;
                 }
             }
             }


        return -1;
    }
}
