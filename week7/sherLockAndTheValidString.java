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
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
    // Write your code here
    int freq [] = new int[26];
    
    for (char ch : s.toCharArray()) {
        freq[ch - 'a']++;
    }
    
    int maxFreq = -1;
    int minFreq = Integer.MAX_VALUE;
    
    for (int i = 0 ; i < 26; i++) {
        if (freq[i] < minFreq && freq[i] > 0) {
            minFreq = freq[i];
        }
        if (freq[i] > maxFreq) {
            maxFreq = freq[i];
        }
    }
    System.out.println(maxFreq + " - " + minFreq);
    
    int countMax = 0;
    int countMin = 0;
    
    for (int i = 0; i < 26; i++) {
        if (freq[i] == maxFreq) {
            countMax++;
        }
        if (freq[i] == minFreq) {
            countMin++;
        }
    }
    
    if (maxFreq - minFreq <= 1 || (countMin == 1 || countMax == 1)) {
        return "YES";
    }
    return "NO";

    }

}

public class sherLockAndTheValidString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
