class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int s=0;
        int e=n-1;
        int leftSum=0;
        int rightSum=0;
        int i1=0;
        while(i1<n){
            leftSum=0;
            rightSum=0;
            int mid=i1;
            for(int i=0; i<mid; i++){
                leftSum+=nums[i];
            }
            for(int i=mid+1; i<n; i++){
                rightSum+=nums[i];
            }
            if(rightSum==leftSum){
                return mid;
            }
            i1++;
        }
        return -1;
    }
}