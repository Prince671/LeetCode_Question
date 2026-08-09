class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int sqArr[]=new int[n];
        
        for(int i=0; i<n; i++){
            sqArr[i]=nums[i]*nums[i];
        }
        Arrays.sort(sqArr);
        return sqArr;
    }
}