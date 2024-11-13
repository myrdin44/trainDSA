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
     * Complete the 'anagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int anagram(String s) {
    // Write your code here
    if (s.length() % 2 != 0) {
        return -1;
    }
    
    String s1 = s.substring(0, s.length() / 2);
    String s2 = s.substring(s.length() / 2);
    
    int f1 [] = new int[26];
    int f2 [] = new int[26];
    
    for (int i = 0; i < s1.length(); i++) {
        f1[s1.charAt(i) - 'a']++;
        f2[s2.charAt(i) - 'a']++;
    }
    
    int count = 0;
    for (int i = 0; i < 26; i++) {
        if (f1[i] > f2[i]) {
            count += (f1[i] - f2[i]);
        }
    }
    
    return count;

    }

}

public class annaGrams {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.anagram(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
