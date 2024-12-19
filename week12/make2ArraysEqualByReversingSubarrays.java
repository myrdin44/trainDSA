package week12;

public class make2ArraysEqualByReversingSubarrays {
    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length) {
            return false;
        }

        int[] freq = new int[1001];
        for (int i = 0; i < target.length; i++) {
            freq[target[i]]++;
            freq[arr[i]]--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
