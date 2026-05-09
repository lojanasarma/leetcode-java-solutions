
package Median_of_Two_Sorted_Arrays_Q4_Hard;
import java.util.Arrays;
/*
THINKING PROCESS:

1. We need to find the median of two sorted arrays.
2. A simple approach is:
   - Merge both arrays into a single array.
   - Sort the merged array.
   - Find the middle element(s).
3. First, calculate the sizes of both arrays.
4. Create a new array with size = m + n.
5. Copy elements of nums1 into the merged array.
6. Copy elements of nums2 into the merged array.
7. Sort the merged array using Arrays.sort().
8. Check whether the total length is odd or even:
   - If odd:
       Median = middle element.
   - If even:
       Median = average of the two middle elements.
9. Return the median as a double value.

Time Complexity:
- Merging arrays: O(m + n)
- Sorting merged array: O((m+n) log(m+n))
- Overall: O((m+n) log(m+n))

Space Complexity:
- O(m+n) because of the extra merged array.
*/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double median = 0.0;

        int m = nums1.length;
        int n = nums2.length;

        int count = 0;

        int[] mergedArray = new int[m+n];

        for(int i=0;i<m;i++){

            mergedArray[count] = nums1[i];
            count++;

        }

        for(int i=0;i<n;i++){

            mergedArray[count] = nums2[i];
            count++;

        }

        //Sort the merged array
        Arrays.sort(mergedArray);

        int l = mergedArray.length;

        //If array is odd
        if(l%2 != 0){

            median = mergedArray[l/2];

        }else{

            median = (mergedArray[(l/2)-1]+mergedArray[l/2])/2.0;

        }

        return median;

    }
}