class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWord=0;
        for(int i=0; i<sentences.length; i++){
            String[] arr=sentences[i].split(" ");
            int length=arr.length;
            maxWord=Math.max(length, maxWord);
        }
        return maxWord;
    }
}