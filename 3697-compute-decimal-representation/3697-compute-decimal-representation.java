class Solution {
    public int[] decimalRepresentation(int n) {
         int place=1;
        ArrayList<Integer> s=new ArrayList<>();
        while(n>0){
            int digit=n%10;
            
            if(digit==0){
                place*=10;
                n/=10;
                continue;
            }
            else{
                s.add(digit*place);
                place*=10;
            }
            n/=10;
        }
        int ans[]=new int[s.size()];
        int index=0;
        for(int i=s.size()-1; i>=0; i--){
          ans[index]=s.get(i);
          index++;
        }
        return ans;
    }
}