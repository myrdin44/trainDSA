public class findTheSumOfEncryptedIntegers {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        
        for (int num : nums) {
            sum += encrypt(num);
        }
        
        return sum;
    }
    
    private int encrypt(int num) {
        int maxDigit = findLargestDigit(num);
        
        String numStr = String.valueOf(num);
        int length = numStr.length();
        
        int result = 0;
        for (int i = 0; i < length; i++) {
            result = result * 10 + maxDigit;
        }
        
        return result;
    }
    private int findLargestDigit(int num) {
        int maxDigit = 0;
        
        // Extract each digit and find the maximum
        while (num > 0) {
            int digit = num % 10;
            maxDigit = Math.max(maxDigit, digit);
            num /= 10;
        }
        
        return maxDigit;
    }
}
