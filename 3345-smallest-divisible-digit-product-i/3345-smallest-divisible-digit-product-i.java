class Solution {
    public int smallestNumber(int n, int t) {

        for (int i = n; i <= 100; i++) {

            int reminderVal = 1;
            int num = i;

            while (num > 0) {
                reminderVal *= num % 10;
                num /= 10;
            }

            if (reminderVal % t == 0) {
                return i;
            }
        }

        return -1;
    }
}