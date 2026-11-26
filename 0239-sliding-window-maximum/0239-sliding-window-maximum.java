class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int ans[]=new int[nums.length-k+1];
        Deque<Integer> dq=new ArrayDeque<>();
        int index=0;

        // Step 1-> Processing the Frist Window of size K
       for(int i=0; i<k; i++){
        int value=nums[i];

        //removing all the vlaue From the DQ Greater than Current Value 
        while(!dq.isEmpty() && nums[dq.peekLast()]<value){
            dq.pollLast();
        }
        dq.offerLast(i);
       }

       ans[index]=nums[dq.peekFirst()];
       index++;

        // Step 2-> Processing the Remaining Window
        for(int i=k; i<nums.length; i++){
            // Removing the unusal Value from the DQ
            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            // Adding the Remaining Value \
            int value=nums[i];
            while(!dq.isEmpty() && nums[dq.peekLast()]<value){
            dq.pollLast();
            }
            dq.offerLast(i);
            // Adding the Value to the ans
            ans[index]=nums[dq.peekFirst()];index++;
        }

        return ans;
    }
}