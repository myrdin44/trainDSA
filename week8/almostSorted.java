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
     * Complete the 'almostSorted' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void almostSorted(List<Integer> arr) {
    // Write your code here
    int start = -1;
    int end = -1;

    for (int i = 0; i < arr.size() - 1; i++) {
        if (arr.get(i) > arr.get(i + 1)) {
            if (start == -1) {
                start = i;
            }
            end = i + 1; 
        }
    }

    // neu array sorted
    if (start == -1) {
        System.out.println("yes");
        return;
    }

    // kiem tra xem swap co solve duoc khong
    Collections.swap(arr, start, end);
    if (isSorted(arr)) {
        System.out.println("yes");
        System.out.println("swap " + (start + 1) + " " + (end + 1));
        return;
    }

    // quay lai mang chua swap de xem co reverse duoc khong
    Collections.swap(arr, start, end); 

    // ktra xem revese array co thoa man khong
    reverseSubarray(arr, start, end);
    if (isSorted(arr)) {
        System.out.println("yes");
        System.out.println("reverse " + (start + 1) + " " + (end + 1));
        return;
    }

    // neu khong co cach swap or reverse nao
    System.out.println("no");

    }

private static boolean isSorted(List<Integer> arr) {
    for (int i = 0; i < arr.size() - 1; i++) {
        if (arr.get(i) > arr.get(i + 1)) {
            return false;
        }
    }
    return true;
}

private static void reverseSubarray(List<Integer> arr, int start, int end) {
    while (start < end) {
        int temp = arr.get(start);
        arr.set(start, arr.get(end));
        arr.set(end, temp);
        start++;
        end--;
    }
}

}

public class almostSorted {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.almostSorted(arr);

        bufferedReader.close();
    }
}
