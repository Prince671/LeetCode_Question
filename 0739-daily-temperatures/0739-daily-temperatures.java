class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int ans[]=new int[n];
        Arrays.fill(ans, 0);
        Deque<Integer> st=new ArrayDeque<>();
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int previousDay=st.pop();
                ans[previousDay]=i-previousDay;
            }
            st.push(i);
        }
        return ans;
    }
}