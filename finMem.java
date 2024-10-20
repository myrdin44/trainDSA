import java.util.Arrays;
public class finMem {
    public static void main(String[] args) {
        int test = 6;
        memo = new int[test + 1];
        Arrays.fill(memo, -1);
        System.out.println(fib(test));        
    }
    private static int [] memo;

    public static int fib(int n) {
        if (memo[n] != -1) {
            return memo[n];
        }

        if (n == 0) {
            memo[n] = 0;
        } else if (n == 1) {
            memo[n] = 1;
        } else {
            memo[n] = fib(n - 1) + fib(n - 2);
        }

        return memo[n];
    }
}
