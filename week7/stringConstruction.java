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
     * Complete the 'stringConstruction' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int stringConstruction(String s) {
    // Write your code here
    int[] seen = new int[26];
    
    // lap de danh dau cac ki tu da xuat hien
    for (char c : s.toCharArray()) {
        seen[c - 'a'] = 1; // danh dau ki tu da duyet qua
    }
    
    // dem so ki tu doc nhat
    int uniqueCount = 0;
    for (int i = 0; i < 26; i++) {
        if (seen[i] == 1) {
            uniqueCount++;
        }
    }
    
    return uniqueCount;
    }

}

public class stringConstruction {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.stringConstruction(s);

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
