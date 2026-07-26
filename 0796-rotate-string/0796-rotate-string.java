class Solution { 
    public boolean rotateString(String s, String goal) { 
        if (s.length() != goal.length()) { 
            return false; 
        } 
        
        String concatinatedString = s + s; 
        
        
        if (concatinatedString.contains(goal)) { 
            return true; 
        } 
        
        return false; 
    } 
}
