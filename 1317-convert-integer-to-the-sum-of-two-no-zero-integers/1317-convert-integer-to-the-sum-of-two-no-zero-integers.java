class Solution {

    public int[] getNoZeroIntegers(int n) {

        int val1 = 0;
        int val2 = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i + j == n && noZero(i) && noZero(j)) {
                    val1 = i;
                    val2 = j;
                    break;
                }
            }

            if (val1 != 0 && val2 != 0) {
                break;
            }
        }

        return new int[]{val1, val2};
    }

    static boolean noZero(int num) {

        while (num > 0) {
            if (num % 10 == 0) {
                return false;
            }

            num /= 10;
        }

        return true;
    }
}