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
     * Complete the 'encryption' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String encryption(String s) {
    // Write your code here
    s = s.trim();
    int row = (int)Math.floor(Math.sqrt(s.length()));
    int column = (int)Math.ceil(Math.sqrt(s.length()));

    StringBuilder[] str = new StringBuilder[column];
    for (int i = 0; i < column; i++) {
        str[i] = new StringBuilder();
    }
    
    for (int i = 0; i < s.length(); i++) {
        str[i % column].append(s.charAt(i));
    }
    
    StringBuilder result = new StringBuilder();
    for (StringBuilder ele : str) {
        result.append(ele).append(" ");
    }
    
    return result.toString().trim();

    }

}

public class encryption {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
