class Solution {
    public long sumAndMultiply(int n) {
        if(n==0){
            return n;
        }
        String val=String.valueOf(n);
        String sortedVal="";
        for(int i=0; i<val.length(); i++){
            char ch=val.charAt(i);
            if(ch!='0'){
                sortedVal+=ch;
            }
        }
        long result=Long.parseLong(sortedVal);
        long reference=result;
        long product=0;
        while(result>0){
            product+=result%10;
            result/=10;
        }
        return reference*product;
    }
}