package Minimum_Common_Value_Q2540_Easy;

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        // Start two pointers at the beginning of both arrays
        int i = 0;
        int j = 0;

        // Traverse both arrays until one pointer reaches the end
        while (i < nums1.length && j < nums2.length) {

            // If both elements are equal,
            // we found the smallest common element
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            }

            // Move the pointer with the smaller value
            // because arrays are sorted
            if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        // No common element found
        return -1;
    }
}