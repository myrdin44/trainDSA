import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'kaprekarNumbers' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER p
     *  2. INTEGER q
     */

    public static void kaprekarNumbers(int p, int q) {
    // Write your code here
    int count = 0;
    
    for (int i = p; i <= q; i++) {
        int digit = String.valueOf(i).length();
        
        long square = (long) i*i;
        
        long part1 = square / (long)Math.pow(10, digit);
        long part2 = square % (long)Math.pow(10, digit);
        
        if (part1 + part2 == (long)i) {
            System.out.print(i + " ");
            count += 1;
        }
    }
    
    if (count == 0) {
        System.out.print("INVALID RANGE");
    }

    }

}

public class modifiedKaprekarNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        Result.kaprekarNumbers(p, q);

        bufferedReader.close();
    }
}
