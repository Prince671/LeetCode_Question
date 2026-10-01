class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        int index = 0;

        for (int i = 1; i <= n; i++) {
            ans.add("Push");
            st.push(i);

            if (st.peek() != target[index]) {
                ans.add("Pop");
                st.pop();
            } else {
                index++;
            }

            if (index == target.length) {
                break;
            }
        }

        return ans;
    }
}