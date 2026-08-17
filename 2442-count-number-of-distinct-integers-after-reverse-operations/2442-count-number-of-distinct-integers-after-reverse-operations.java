class Solution {
    public int countDistinctIntegers(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {

            set.add(num);

            int reversed = 0;
            int temp = num;

            while (temp > 0) {
                int digit=temp%10;
                reversed = reversed * 10 + digit;
                temp /= 10;
            }

            set.add(reversed);
        }

        return set.size();
    }
}