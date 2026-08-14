class Solution {
    public int smallestEvenMultiple(int n) {
        int multiple=0;
        for(int i=1; i<=2*n; i++){
            if(i%2==0 && i%n==0){
                multiple=i;
                break;
            }
        }
        return multiple;
    }
}