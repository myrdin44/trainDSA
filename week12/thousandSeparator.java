package week12;

public class thousandSeparator {
    public String thousandSeparator(int n) {
        if (n == 0) return "0";
        
        String str = String.valueOf(n);
        StringBuilder result = new StringBuilder();
        
        int len = str.length();
        
        for (int i = 0; i < len; i++) {
            if (i > 0 && (len - i) % 3 == 0) {
                result.append('.');
            }
            
            result.append(str.charAt(i));
        }
        
        return result.toString();
    }
}
