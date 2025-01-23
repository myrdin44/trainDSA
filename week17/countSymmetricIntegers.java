package week17;

public class countSymmetricIntegers {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if (String.valueOf(i).length() % 2 != 0) {
                continue;
            } else if (isSymmetric(i)) {
                count++;
            }
        }

        return count;
    }

    private boolean isSymmetric(int num) {
        int size = String.valueOf(num).length() / 2;

        int leftSum = 0;
        int rightSum = 0;

        for (char ch : String.valueOf(num).substring(0,size).toCharArray()) {
            leftSum += ch - '0';
        }
        for (char ch : String.valueOf(num).substring(size).toCharArray()) {
            rightSum += ch - '0';
        }

        return leftSum == rightSum;
    }
}
