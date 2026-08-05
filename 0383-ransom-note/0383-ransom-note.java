class Solution { 
    public boolean canConstruct(String ransomNote, String magazine) { 
        if (ransomNote.length() == 0) return true; 
        
        char arr[] = magazine.toCharArray(); 
        
        for (int i = 0; i < ransomNote.length(); i++) { 
            char ch = ransomNote.charAt(i); 
            boolean charFound = false;
            
            for (int j = 0; j < arr.length; j++) { 
                if (arr[j] == ch) { 
                    charFound = true; 
                    arr[j] = '0'; 
                    break;
                } 
                
            } 
            
            
            if (!charFound) { 
                return false; 
            } 
        } 
        
        return true; 
    } 
}
