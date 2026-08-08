class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int leftP=0;
        int rightP=n-1;
        int ansIndex=-1;
        while(leftP<=rightP){
            int mid=leftP+(rightP-leftP)/2;
            if(arr[mid]>arr[mid+1]){
                ansIndex=mid;
                rightP=mid-1;
            }
            else{
                leftP=mid+1;
            }
        }
        return ansIndex;
    }
}