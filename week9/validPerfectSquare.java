package week9;

public class validPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int square  = (int)Math.sqrt(num);
        if (square * square == num) {
            return true;
        }

        return false;
    }
}
