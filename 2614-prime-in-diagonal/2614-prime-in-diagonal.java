class Solution {
    static boolean isPrime(int x) {

        if(x <= 1) {
            return false;
        }

        for(int i = 2; i * i <= x; i++) {

            if(x % i == 0) {
                return false;
            }
        }

        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        ArrayList<Integer> diagonalVal=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(isPrime(nums[i][i])){
            diagonalVal.add(nums[i][i]);
            }

            if (i != n - i - 1) { 
                if(isPrime(nums[i][n-i-1])){
                diagonalVal.add(nums[i][n - i - 1]);
                }
            }
        }

        if(diagonalVal.size()==0){
            return 0;
        }
        
        
           int max=0;
            for(int val:diagonalVal){
                if(val>max){
                    max=val;
                }
            }
            System.out.println(max);
            return max;

    }
}