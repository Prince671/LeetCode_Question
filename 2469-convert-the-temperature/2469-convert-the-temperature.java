class Solution {
    public double[] convertTemperature(double celsius) {
        double ans[]=new double[2];
        int index=0;
        ans[index]=celsius+(double) 273.15;
        index++;
        ans[index]=celsius*(double) 1.80 + (double) 32.00;
        return ans;


    }
}