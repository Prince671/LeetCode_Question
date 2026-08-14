class Solution {
    public int missingMultiple(int[] nums, int k) {
        int val=k;
        Set<Integer> withOutDuplicate = new HashSet<>(Arrays.stream(nums).boxed().toList());

        while(withOutDuplicate.contains(k)){
            k += val ;
        }

        return k;
    }
}