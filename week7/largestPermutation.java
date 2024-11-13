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
     * Complete the 'largestPermutation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> largestPermutation(int k, List<Integer> arr) {
    // Write your code here
        int size = arr.size();
        
        for (int i = 0; i < size && k > 0; i++) {
            int maxNum = size - i;
            int maxIndex = -1;
            
            // tim max trong list con lai
            for (int j = i; j < size; j++) {
                if (arr.get(j) == maxNum) {
                    maxIndex = j;
                    break;
                }
            }
            
            if (maxIndex != -1 && arr.get(i) != maxNum) {
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(maxIndex));
                arr.set(maxIndex, temp);
                
                // giam k sau moi lan swap
                k--;
            }
            
            // ket thuc neu khong co swap nao
            if (k == 0) {
                break;
            }
        }
        
        return arr;

    }

}

public class largestPermutation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.largestPermutation(k, arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
