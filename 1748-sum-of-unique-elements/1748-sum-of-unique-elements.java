class Solution {
    public int sumOfUnique(int[] nums) {
        int countFreq[]=new int[101];
        for(int num:nums){
            countFreq[num]++;
        }
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (countFreq[i] == 1) {
                sum += i;
            }
        }

        return sum;
    }
}