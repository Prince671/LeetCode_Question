class Solution {
    public int[] finalPrices(int[] prices) {
        int ans[]=new int[prices.length];
        int i=0;
        
        while(i<ans.length){
          if(i+1==ans.length){
            break;
          }
          int j=i+1;
            if(prices[j]<=prices[i]){
                ans[i]=prices[i]-prices[j];
            }else{
              while(j<prices.length){
                if(prices[j]<=prices[i]){
                  ans[i]=prices[i]-prices[j];
                  break;
                }
                j++;
              }
                if(j==prices.length){
                  ans[i]=prices[i];
                }
              }
            

            i++;
            j++;
        }
        while(i<ans.length){
          ans[i]=prices[i];
          i++;
        }
        return ans;
    }
}