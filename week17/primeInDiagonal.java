package week17;

public class primeInDiagonal {
    public int diagonalPrime(int[][] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i][i]) && nums[i][i] > max) {
                max = nums[i][i];
            }
            if (isPrime(nums[i][nums.length - i - 1]) && nums[i][nums.length - i - 1] > max) {
                max = nums[i][nums.length - i - 1];
            }
        }

        return max;
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for(int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
