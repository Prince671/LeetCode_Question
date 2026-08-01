class Solution {
     public static void mergeSort(int[] nums, int lb, int ub){
        // 2. Fix the base case to prevent infinite recursion
        if (lb >= ub) {
            return;
        }
        
        int mid = lb + (ub - lb) / 2;
        mergeSort(nums, lb, mid);
        mergeSort(nums, mid + 1, ub);
        merge(nums, lb, mid, ub);
    }

    // 3. Added the missing merge function
    public static void merge(int[] nums, int lb, int mid, int ub) {
        int[] temp = new int[ub - lb + 1];
        int i = lb;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ub) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= ub) {
            temp[k++] = nums[j++];
        }

        for (i = lb, k = 0; i <= ub; i++, k++) {
            nums[i] = temp[k];
        }
    }
    public int[] sortArray(int[] nums) {
      
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    
    }
}