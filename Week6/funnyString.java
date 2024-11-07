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
     * Complete the 'funnyString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String funnyString(String s) {
    // Write your code here
    char bin [] = s.toCharArray();
    int toInt [] = new int[bin.length];
    int differrence [] = new int[bin.length - 1];
    
    for (int i = 0; i < bin.length; i++) {
        toInt[i] = (int) bin[i];
    }
    
    for (int i = 1; i < toInt.length; i++) {
        differrence[i - 1] = Math.abs(toInt[i] - toInt[i - 1]);
    }
    
    for (int k = 0; k < differrence.length; k++) {
        if (differrence[k] != differrence[differrence.length - k - 1]) {
            return "Not Funny";
        }
    }
    
    return "Funny";
    }

}

public class funnyString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.funnyString(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
