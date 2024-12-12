package week11;

public class detectCapital {
    public boolean detectCapitalUse(String word) {
        if (word.length() <= 1) return true;
        
        boolean allCaps = word.toUpperCase().equals(word);
        
        boolean allLower = word.toLowerCase().equals(word);
        
        boolean firstCapRest = 
            Character.isUpperCase(word.charAt(0)) && 
            word.substring(1).toLowerCase().equals(word.substring(1));
        
        return allCaps || allLower || firstCapRest;
    }
}
