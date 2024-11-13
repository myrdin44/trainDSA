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
     * Complete the 'gameOfThrones' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String gameOfThrones(String s) {
    // Write your code here
    int freq [] = new int[26];
    
    for (char ch : s.toCharArray()) {
        freq[ch - 'a']++;
    }
    
    int countChar = 0;
    int countEvenChar = 0;
    
    //dem so ki tu xuat hien va so ki tu cuat hien chan lan
    for (int i = 0; i < 26; i++) {
        if (freq[i] > 0) {
            if (freq[i] % 2 == 0) {
                countEvenChar++;
            }
            countChar++;
        }
    }
    
    //co nhieu nhat 1 ki tu chi xuat hien 1 lan, cac ki tu con lai xuat hien chan lan thi return YES
    if (countChar - countEvenChar <= 1) {
        return "YES";
    }
    return "NO";

    }

}

public class gameOfThrones {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
