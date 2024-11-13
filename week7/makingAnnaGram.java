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
     * Complete the 'makingAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static int makingAnagrams(String s1, String s2) {
    // Write your code here
    int f1 [] = new int[26];
    int f2 [] = new int[26];
    
    for (char ch : s1.toCharArray()) {
        f1[ch - 'a']++;
    }
    for (char ch : s2.toCharArray()) {
        f2[ch - 'a']++;
    }
    
    int deletions = 0;
    
    for (int i = 0; i < 26; i++) {
        System.out.println(f1[i] + " - " + f2[i]);
        deletions += Math.abs(f1[i] - f2[i]);
    }
    
    return deletions;
    
    }

}

public class makingAnnaGram {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = bufferedReader.readLine();

        String s2 = bufferedReader.readLine();

        int result = Result.makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
