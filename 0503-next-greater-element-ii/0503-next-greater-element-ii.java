class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        Deque<Integer> monoStack=new ArrayDeque<>();
        Arrays.fill(ans, -1);
        int index=0;
        for (int i = 0; i < 2 * n; i++) {
            int currentIndex = i % n;

            while(!monoStack.isEmpty() && nums[currentIndex]>nums[monoStack.peek()]){                
                int getIndexValue=monoStack.pop();
                ans[getIndexValue]=nums[currentIndex];
            }
            if (i < n) {
                monoStack.push(currentIndex);
            }
           
        }

        return ans;
    }
}