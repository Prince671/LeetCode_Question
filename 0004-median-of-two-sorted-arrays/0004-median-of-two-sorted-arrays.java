class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int i = 0;
        int j = 0;

        int[] sortedArr = new int[nums1.length + nums2.length];
        int k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                sortedArr[k] = nums1[i];
                i++;
            } else {
                sortedArr[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < nums1.length) {
            sortedArr[k] = nums1[i];
            i++;
            k++;
        }

        while (j < nums2.length) {
            sortedArr[k] = nums2[j];
            j++;
            k++;
        }

        int mid = sortedArr.length / 2;

        if (sortedArr.length % 2 == 0) {
            return (sortedArr[mid - 1] + sortedArr[mid]) / 2.0;
        } else {
            return sortedArr[mid];
        }
    }
}