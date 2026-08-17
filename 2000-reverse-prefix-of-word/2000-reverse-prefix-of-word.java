class Solution {
    public String reversePrefix(String word, char ch) {

        int start = 0;
        int end = -1;

        // Find first occurrence of ch
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                end = i;
                break;
            }
        }

        // ch not found
        if (end == -1) {
            return word;
        }

        char[] arr = word.toCharArray();

        // Reverse prefix
        while (start <= end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return new String(arr);
    }
}