package Week5;

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
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
    // Write your code here
    int commonLength = 0;
    int minLength = Math.min(s.length(), t.length());
    
    while (commonLength < minLength && s.charAt(commonLength) == t.charAt(commonLength)) {
        commonLength++;
    }
    
    int deletionsNeeded = s.length() - commonLength;
    int additionsNeeded = t.length() - commonLength;
    int totalOperationsNeeded = deletionsNeeded + additionsNeeded;

    if (totalOperationsNeeded == k) {
        return "Yes";
    } else if (totalOperationsNeeded < k) {
        if ((k - totalOperationsNeeded) % 2 == 0 || s.length() + t.length() <= k) {
            return "Yes";
        }
    }
    
    return "No";
    }

}

public class appendAndDelete {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
