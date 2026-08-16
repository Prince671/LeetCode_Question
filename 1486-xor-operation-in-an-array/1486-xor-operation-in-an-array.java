class Solution {
    public int xorOperation(int n, int start) {
        int ans[]=new int[n];
        for(int i=0; i<n; i++){
            ans[i]=start+2*i;
        }
        int result=0;
        for(int val:ans){
          result^=val;
        }
        return result;
    }
}