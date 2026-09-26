class Solution {
    public int differenceOfSums(int n, int m) {
        int d_val=0;
        int n_d_val=0;
        for(int i=1; i<=n; i++){
            if(i%m!=0){
                n_d_val+=i;
            }else{
                d_val+=i;
            }
        }
        return n_d_val-d_val;
    }
}