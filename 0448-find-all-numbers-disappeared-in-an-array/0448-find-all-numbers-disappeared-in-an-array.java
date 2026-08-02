import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        
        // Step 1: Mark visited indices by negating the values at those positions
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1; // Get the index this value maps to
            if (nums[index] > 0) {
                nums[index] = -nums[index]; // Mark as negative
            }
        }
        
        // Step 2: Any index that remains positive means its corresponding number never appeared
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                result.add(i + 1); // Index i maps to number i + 1
            }
        }
        
        return result;
    }
}
