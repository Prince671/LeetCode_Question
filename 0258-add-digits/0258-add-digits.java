class Solution {
    public int addDigits(int num) {
      int digitSum = 0;
int finalSum = 0;

while (num > 9) {
    digitSum = 0;

    while (num > 0) {
        digitSum += num % 10;
        num /= 10;
    }

    num = digitSum;
}

return num;
    }
}