package week8;

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
     * Complete the 'steadyGene' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING gene as parameter.
     */
     
    // Check if the current counts meet the steady condition
    private static boolean isSteady(Map<Character, Integer> count, int target) {
        for (char c : "ACGT".toCharArray()) {
            if (count.getOrDefault(c, 0) > target) {
                return false;
            }
        }
        return true;
    }

    public static int steadyGene(String gene) {
    // Write your code here
        int n = gene.length();
        int target = n / 4;
        Map<Character, Integer> count = new HashMap<>();
        
        // Initialize the character count
        for (char c : gene.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // Check if the gene is already steady
        if (isSteady(count, target)) {
            return 0;
        }

        int minLength = n;
        int left = 0;

        // Sliding window to find the minimum length substring
        for (int right = 0; right < n; right++) {
            char rightChar = gene.charAt(right);
            count.put(rightChar, count.get(rightChar) - 1);

            // Shrink the window from the left if it satisfies the steady condition
            while (isSteady(count, target)) {
                minLength = Math.min(minLength, right - left + 1);
                char leftChar = gene.charAt(left);
                count.put(leftChar, count.get(leftChar) + 1);
                left++;
            }
        }

        return minLength;

    }

}

public class bearAndSteadyGene {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String gene = bufferedReader.readLine();

        int result = Result.steadyGene(gene);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
