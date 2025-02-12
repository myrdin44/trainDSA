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
     * Complete the 'surfaceArea' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY A as parameter.
     */

    public static int surfaceArea(List<List<Integer>> A) {
    // Write your code here
    int n = A.size();           // rows
    int m = A.get(0).size();    // columns
    int surfaceArea = 0;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            int height = A.get(i).get(j);

            // mat tren va duoi
            surfaceArea += 2;

            // kiem tra ca khoi lien ke
            // block lien trai
            if (j == 0) {
                surfaceArea += height;
            } else {
                surfaceArea += Math.max(0, height - A.get(i).get(j - 1));
            }

            // block lien phai
            if (j == m - 1) {
                surfaceArea += height;
            } else {
                surfaceArea += Math.max(0, height - A.get(i).get(j + 1));
            }

            // block lien truoc
            if (i == 0) {
                surfaceArea += height;
            } else {
                surfaceArea += Math.max(0, height - A.get(i - 1).get(j));
            }

            // block lien sau
            if (i == n - 1) {
                surfaceArea += height;
            } else {
                surfaceArea += Math.max(0, height - A.get(i + 1).get(j));
            }
        }
    }
    
    return surfaceArea;

    }

}

public class threedSurfaceArea {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int H = Integer.parseInt(firstMultipleInput[0]);

        int W = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> A = new ArrayList<>();

        IntStream.range(0, H).forEach(i -> {
            try {
                A.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.surfaceArea(A);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
