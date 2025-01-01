package week14;

public class threeDivisors {
    public boolean isThree(int n) {
        int nSquare = (int)Math.sqrt(n);
        int count = 2;
        for (int i = 2; i <= nSquare; i++) {
            if (count > 3) {
                return false;
            }

            if (i*i == n) {
                count++;
            } else if (n % i == 0) {
                count+= 2;
            }
        }

        return count == 3 ? true : false;
    }
}
