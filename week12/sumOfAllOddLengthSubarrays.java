package week12;

public class sumOfAllOddLengthSubarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int totalSum = 0;
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            int totalSubarrays = ((i + 1) * (n - i) + 1) / 2;
            
            totalSum += arr[i] * totalSubarrays;
        }
        
        return totalSum;
    }
}
