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
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {
    // Return the minimum number of characters to make the password strong
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";

        // khoi tao cac dieu kien can check
        boolean hasDigit = false;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;

        // kiem tra cac dieu kien
        for (char c : password.toCharArray()) {
            if (numbers.indexOf(c) >= 0) hasDigit = true;
            if (lower_case.indexOf(c) >= 0) hasLower = true;
            if (upper_case.indexOf(c) >= 0) hasUpper = true;
            if (special_characters.indexOf(c) >= 0) hasSpecial = true;
        }

        // dem so dieu kien khong thoa man
        int missingTypes = 0;
        if (!hasDigit) {
            missingTypes++;
        }
        if (!hasLower) {
            missingTypes++;
        }
        if (!hasUpper) {
            missingTypes++;
        }
        if (!hasSpecial) {
            missingTypes++;
        }

        int requiredLength = 6; 
        int lengthDiff = requiredLength - n;

        return Math.max(missingTypes, lengthDiff);    

    }

}

public class strongPassword {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
