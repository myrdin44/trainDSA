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
     * Complete the 'happyLadybugs' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING b as parameter.
     */

    public static String happyLadybugs(String b) {
    // Write your code here
        boolean hasEmptyCell = b.contains("_");

        // dem so lan xuat hien cua moi mau (color)
        Map<Character, Integer> colorCount = new HashMap<>();
        for (char c : b.toCharArray()) {
            if (c != '_') {
                colorCount.put(c, colorCount.getOrDefault(c, 0) + 1);
            }
        }

        // neu bat ki mau nao co so luong la 1 thi return NO
        for (int count : colorCount.values()) {
            if (count == 1) {
                return "NO";
            }
        }

        // neu khong co ki tu _ thi kiem tra xem tat ca con bo da happy chua?
        if (!hasEmptyCell) {
            for (int i = 1; i < b.length() - 1; i++) {
                if (b.charAt(i) != b.charAt(i - 1) && b.charAt(i) != b.charAt(i + 1)) {
                    return "NO";
                }
            }
        }

        return "YES";

    }

}

public class happyLadyBugs {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, g).forEach(gItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                String b = bufferedReader.readLine();

                String result = Result.happyLadybugs(b);

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
