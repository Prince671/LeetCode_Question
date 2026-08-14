class Solution {
    public String kthDistinct(String[] arr, int k) {

        HashMap<String, Integer> freq = new HashMap<>();
        ArrayList<String> distinct = new ArrayList<>();

        // Count frequency
        for (String val : arr) {
            freq.put(val, freq.getOrDefault(val, 0) + 1);
        }

        // Get distinct strings in original order
        for (String val : arr) {
            if (freq.get(val) == 1) {
                distinct.add(val);
            }
        }

        if (distinct.size() < k) {
            return "";
        }

        return distinct.get(k - 1);
    }
}