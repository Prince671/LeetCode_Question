class Solution {

    static boolean compareFreq(int[] freq, int[] freq2) {
        for (int i = 0; i < 26; i++) {
            if (freq[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {

        int windowSize = s1.length();

        if (s1.length() > s2.length()) {
            return false;
        }

        // Frequency of characters in s1
        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            freq[ch - 'a']++;
        }

        // Frequency of first window of s2
        int[] freq2 = new int[26];

        for (int i = 0; i < windowSize; i++) {
            char ch = s2.charAt(i);
            freq2[ch - 'a']++;
        }

        // Check first window
        if (compareFreq(freq, freq2)) {
            return true;
        }

        // Sliding window
        for (int i = windowSize; i < s2.length(); i++) {

            // Add new character
            char newChar = s2.charAt(i);
            freq2[newChar - 'a']++;

            // Remove old character
            char oldChar = s2.charAt(i - windowSize);
            freq2[oldChar - 'a']--;

            // Compare frequencies
            if (compareFreq(freq, freq2)) {
                return true;
            }
        }

        return false;
    }
}