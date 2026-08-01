class Solution {
    static void merge(int[]nums,int s,int e,int mid){
        int leftLen=mid-s+1;
        int rightLen=e-mid;
        int[]leftArr=new int[leftLen];
        int[]rightArr=new int[rightLen];

        int k=s;
        for(int i=0;i<leftLen;i++){
            leftArr[i]=nums[k];
            k++;
        }
        k=mid+1;
        for(int i=0;i<rightLen;i++){
            rightArr[i]=nums[k];
            k++;
        }
        
        int i=0;
        int j=0;
         k=s;
        while(i<leftLen && j<rightLen){
            if(leftArr[i]<rightArr[j]){
                nums[k]=leftArr[i];
                i++;
                k++;
            }else{
                nums[k]=rightArr[j];
                j++;
                k++;
            }
        }

        while(i<leftLen){
            nums[k]=leftArr[i];
            i++;
            k++;
        }
        while(j<rightLen){
            nums[k]=rightArr[j];
            j++;
            k++;
        }
    }
    static void mergeSort(int[]nums,int l,int r){
        int s=l;
        int e=r;
        if(s>=e){
            return ;
        }
        int mid=(s+e)/2;
        mergeSort(nums,s,mid);
        mergeSort(nums,mid+1,e);

        merge(nums,s,e,mid);
    }
    public int[] sortArray(int[] nums) {
      
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    
    }
}