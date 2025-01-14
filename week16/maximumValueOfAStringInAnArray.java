package week16;

public class maximumValueOfAStringInAnArray {
    public int maximumValue(String[] strs) {
        int maxValue = 0;
        
        for (String str : strs) {
            maxValue = Math.max(maxValue, getValue(str));
        }
        
        return maxValue;
    }
    private int getValue(String str) {
        boolean onlyDigits = true;
        
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                onlyDigits = false;
                break;
            }
        }
        
        if (onlyDigits) {
            return Integer.parseInt(str);
        } else {
            return str.length();
        }
    }
}
