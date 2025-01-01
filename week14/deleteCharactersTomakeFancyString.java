package week14;

public class deleteCharactersTomakeFancyString {
    public String makeFancyString(String s) {
        if (s.length() < 3) {
            return s;
        }
        
        StringBuilder result = new StringBuilder();
        result.append(s.charAt(0));
        result.append(s.charAt(1));
        
        for (int i = 2; i < s.length(); i++) {
            // by comparing with last two characters in result
            if (s.charAt(i) != result.charAt(result.length() - 1) || 
                s.charAt(i) != result.charAt(result.length() - 2)) {
                result.append(s.charAt(i));
            }
        }
        
        return result.toString();
    }
}
