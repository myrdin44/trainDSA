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
     * Complete the 'organizingContainers' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts 2D_INTEGER_ARRAY container as parameter.
     */

    public static String organizingContainers(List<List<Integer>> container) {
    // Write your code here
    int bound = container.size();
    ArrayList<Integer> containerSum = new ArrayList<>();
    ArrayList<Integer> ballTypeSum = new ArrayList<>();
    
    for (int k = 0; k < bound; k++) {
        containerSum.add(0);
        ballTypeSum.add(0);
    }
    
    for (int i = 0; i < container.size(); i++) {
        for (int j = 0; j < container.get(i).size(); j++) {
            containerSum.set(i, containerSum.get(i) + container.get(i).get(j));
            ballTypeSum.set(j, ballTypeSum.get(j) + container.get(i).get(j));
        }
    }
    
    Collections.sort(containerSum);
    Collections.sort(ballTypeSum);
    
    for (int i = 0; i < bound; i++) {
        if (!containerSum.get(i).equals(ballTypeSum.get(i))) {
            return "Impossible";
        }
    }
    
    return "Possible";

    }

}

public class organizingContainersOfBall {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<List<Integer>> container = new ArrayList<>();

                IntStream.range(0, n).forEach(i -> {
                    try {
                        container.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                        );
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                String result = Result.organizingContainers(container);

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
