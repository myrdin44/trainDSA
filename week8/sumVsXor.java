package week8;

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
     * Complete the 'sumXor' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long sumXor(long n) {
    // Write your code here
    long countSatisfiedValue = 0;
    int zeroBitCount = 0;
    while (n > 0) {
        if ((n & 1) == 0) { //currentbit = 0 ?
            zeroBitCount++;
        }
        n >>= 1; // qua bit tiep theo
    }
    countSatisfiedValue = 1L << zeroBitCount; // tra ve 2 ^ zerobit

    
    return countSatisfiedValue;

    }

}

public class sumVsXor {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.sumXor(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
