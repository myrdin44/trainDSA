package week16;

public class seperateTheDigitsInAnArray {
    public int[] separateDigits(int[] nums) {
        String allNums = "";
        for (int num : nums) {
            allNums += String.valueOf(num);
        }
        
        int[] result = new int[allNums.length()];
        
        for (int i = 0; i < allNums.length(); i++) {
            result[i] = allNums.charAt(i) - '0';
        }
        
        return result;   
    }
}
