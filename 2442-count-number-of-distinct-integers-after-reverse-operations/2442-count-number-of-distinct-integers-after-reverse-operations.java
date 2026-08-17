class Solution {
    public int countDistinctIntegers(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {

            set.add(num);

            int reversed = 0;

            while (num > 0) {
                reversed = reversed * 10 + num % 10;
                num /= 10;
            }

            set.add(reversed);
        }

        return set.size();
    }
}