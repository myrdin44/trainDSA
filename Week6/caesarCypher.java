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
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
    // Write your code here
    String al = "abcdefghijklmnopqrstuvwxyz";
    String AL = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    char alphabet [] = al.toCharArray();
    k = k % 26;
    String res = "";
        
    for (char c : s.toCharArray()) {
        if (al.indexOf(c) >= 0) {
            int newIndex = (al.indexOf(c) + k) % 26;
            res += al.charAt(newIndex);
        }
        else if (AL.indexOf(c) >= 0) {
            int newIndex = (AL.indexOf(c) + k) % 26;
            res += AL.charAt(newIndex);
        }
        else {
            res += c;
        }
    }
    
    return res;

    }

}

public class caesarCypher {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
