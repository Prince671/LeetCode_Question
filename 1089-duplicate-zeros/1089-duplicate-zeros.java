class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] nums = new int[n];

        int i = 0;

        for (int j = 0; j < n && i < n; j++) {

            if (arr[j] == 0) {
                if (i < n) {
                    nums[i] = 0;
                    i++;
                }

                if (i < n) {
                    nums[i] = 0;
                    i++;
                }

            } else {
                nums[i] = arr[j];
                i++;
            }
        }

        for (i = 0; i < n; i++) {
            arr[i] = nums[i];
        }
    }
}