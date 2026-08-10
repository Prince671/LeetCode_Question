class Solution {
    public int bitwiseComplement(int n) {
        String b = Integer.toBinaryString(n);
        StringBuilder binary=new StringBuilder();
        for(int i=0; i<b.length(); i++) {
            char ch=b.charAt(i);
            if(ch=='0'){
                binary.append("1");
            }
            else{
                binary.append("0");
            }
        }
        return Integer.parseInt(binary.toString(), 2);
    }
}