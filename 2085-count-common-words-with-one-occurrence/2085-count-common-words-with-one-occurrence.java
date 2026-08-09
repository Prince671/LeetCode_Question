class Solution {
    public int countWords(String[] words1, String[] words2) {
         Map<String, Integer> freq = new LinkedHashMap<>();

        for (String word : words1) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        Set<String> set = new LinkedHashSet<>();

        for (String word : words1) {
            if (freq.get(word) == 1) {
                set.add(word);
            }
        }

        Map<String, Integer> freq2 = new LinkedHashMap<>();

        for (String word : words2) {
            freq2.put(word, freq2.getOrDefault(word, 0) + 1);
        }

        Set<String> set1 = new LinkedHashSet<>();

        for (String word : words2) {
            if (freq2.get(word) == 1) {
                set1.add(word);
            }
        }
        
        int count = 0;

        for (String val : set1) {
            if (set.contains(val)) {
                count++;
            }
        }

        
        return count;
    }
}