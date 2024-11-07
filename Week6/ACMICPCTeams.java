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
     * Complete the 'acmTeam' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY topic as parameter.
     */

    public static List<Integer> acmTeam(List<String> topic) {
    // Write your code here
        int n = topic.size();
        int maxTopics = 0;
        int maxTeams = 0;
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int topicsKnown = 0;
                int length = topic.get(i).length();
                
                for (int k = 0; k < length; k++) {
                    if (topic.get(i).charAt(k) == '1' || topic.get(j).charAt(k) == '1') {
                        topicsKnown++;
                    }
                }

                if (topicsKnown > maxTopics) {
                    maxTopics = topicsKnown;
                    maxTeams = 1;
                } else if (topicsKnown == maxTopics) {
                    maxTeams++;
                }
            }
        }
        res.add(maxTopics);
        res.add(maxTeams);
        
        return res;
    }

}

public class ACMICPCTeams {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<String> topic = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> result = Result.acmTeam(topic);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
