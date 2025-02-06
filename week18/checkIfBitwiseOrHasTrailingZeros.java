public class checkIfBitwiseOrHasTrailingZeros {
    public boolean hasTrailingZeros(int[] nums) {
        int countEvenNumbers = 0;
        
        for (int num : nums) {
            if ((num & 1) == 0) {
                countEvenNumbers++;
                if (countEvenNumbers >= 2) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
