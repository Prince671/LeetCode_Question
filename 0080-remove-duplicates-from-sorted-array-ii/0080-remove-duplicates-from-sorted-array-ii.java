
import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {

        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int index = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int count = entry.getValue();

            if (count > 2) {
                nums[index++] = key;
                nums[index++] = key;
            } else {
                for (int j = 0; j < count; j++) {
                    nums[index++] = key;
                }
            }
        }

        return index;
    }
}
