class Solution {
    public int findComplement(int num) {
    String binary = Integer.toBinaryString(num);
StringBuilder complement = new StringBuilder();

for (int i = 0; i < binary.length(); i++) {
    char ch = binary.charAt(i);
    if (ch == '1') {
        complement.append('0');
    } else {
        complement.append('1');
    }
}
int decimalResult = Integer.parseInt(complement.toString(), 2);
return decimalResult;
    }
}