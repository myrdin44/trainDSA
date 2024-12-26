package week13;

public class decompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                size += nums[i];
            }
        }

        int result [] = new int[size];

        int index = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i % 2 == 0) {
                for (int p = 0; p < nums[i]; p++) {
                    result[index++] = nums[i+1];
                }
            }
        }

        return result;
    }
}