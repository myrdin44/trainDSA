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
     * Complete the 'timeInWords' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER h
     *  2. INTEGER m
     */

    public static String timeInWords(int h, int m) {
    // Write your code here
        HashMap<Integer, String> numberWords = new HashMap<>();
        numberWords.put(1, "one");
        numberWords.put(2, "two");
        numberWords.put(3, "three");
        numberWords.put(4, "four");
        numberWords.put(5, "five");
        numberWords.put(6, "six");
        numberWords.put(7, "seven");
        numberWords.put(8, "eight");
        numberWords.put(9, "nine");
        numberWords.put(10, "ten");
        numberWords.put(11, "eleven");
        numberWords.put(12, "twelve");
        numberWords.put(13, "thirteen");
        numberWords.put(14, "fourteen");
        numberWords.put(15, "quarter");
        numberWords.put(16, "sixteen");
        numberWords.put(17, "seventeen");
        numberWords.put(18, "eighteen");
        numberWords.put(19, "nineteen");
        numberWords.put(20, "twenty");
        numberWords.put(21, "twenty one");
        numberWords.put(22, "twenty two");
        numberWords.put(23, "twenty three");
        numberWords.put(24, "twenty four");
        numberWords.put(25, "twenty five");
        numberWords.put(26, "twenty six");
        numberWords.put(27, "twenty seven");
        numberWords.put(28, "twenty eight");
        numberWords.put(29, "twenty nine");
        numberWords.put(30, "half");

        if (m == 0) {
            return numberWords.get(h) + " o' clock";
        }

        if (m <= 30) {
            if (m == 15 || m == 30) {
                return numberWords.get(m) + " past " + numberWords.get(h);
            } else if (m == 1) {
                return numberWords.get(m) + " minute past " + numberWords.get(h);
            } else {
                return numberWords.get(m) + " minutes past " + numberWords.get(h);
            }
        }

        int minutesToNextHour = 60 - m;
        int nextHour = (h % 12) + 1;
        if (minutesToNextHour == 15) {
            return numberWords.get(minutesToNextHour) + " to " + numberWords.get(nextHour);
        } else if (minutesToNextHour == 1) {
            return numberWords.get(minutesToNextHour) + " minute to " + numberWords.get(nextHour);
        } else {
            return numberWords.get(minutesToNextHour) + " minutes to " + numberWords.get(nextHour);
        }

    }

}

public class theTimeInWords {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
