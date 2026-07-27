class Solution {
    public String toLowerCase(String s) {
         // Handle empty or null strings safely
        if (s == null || s.trim().isEmpty()) {
            return s;
        }

        String[] words = s.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            // Check if the word is NOT entirely lowercase
            if (!word.equals(word.toLowerCase())) {
                // Convert the specific word to lowercase
                word = word.toLowerCase();
            }

            result.append(word);

            // Add the space back between words (but not after the last word)
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}