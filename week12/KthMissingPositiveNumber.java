package week12;

import java.util.ArrayList;

public class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
        //tao list luu cac so bi miss tu 1 den arrMax
        ArrayList<Integer> result = new ArrayList<>();

        int i = 1;
        int j = 0;

        //them cac so bi thieu vao list
        while (i <= arr[arr.length - 1]) {
            if (i != arr[j]) {
                result.add(i);
                i++;
            } else {
                i++;
                j++;
            }
        }

        //neu k < do dai mang thi tra ve phan tu bi thieu thu k
        if (k <= result.size()) {
            return result.get(k - 1);
        }

        //nguoc lai tra ve phan tu bi thieu + k - result
        return arr[arr.length - 1] + (k - result.size());
    }
}
