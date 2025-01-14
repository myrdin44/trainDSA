package week16;

import java.util.HashMap;
import java.util.Map;

public class sortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        
        //HashMap để lưu trữ cặp height -> name
        Map<Integer, String> heightToName = new HashMap<>();
        for (int i = 0; i < n; i++) {
            heightToName.put(heights[i], names[i]);
        }
        
        mergeSort(heights, n);
        String[] result = new String[n];
        
        // Xây dựng mảng kết quả từ heights đã sắp xếp
        for (int i = 0; i < n; i++) {
            result[i] = heightToName.get(heights[n - 1 - i]);
        }
        
        return result;    }

    private void merge(int arr[], int left[], int right[], int lSize, int rSize) {
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < lSize && j < rSize) {
            if (left[i] < right[j]) {
                arr[index++] = left[i++];
            } else {
                arr[index++] = right[j++];
            }
        }

        while (i < lSize) {
            arr[index++] = left[i++];
        }
        while (j < rSize) {
            arr[index++] = right[j++];
        }
    }

    private void mergeSort(int arr [], int n) {
        if (n < 2) {return;}

        int mid = n / 2;

        int l [] = new int[mid];
        int r [] = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }

        for (int j = mid; j < n; j++) {
            r[j - mid] = arr[j];
        }

        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(arr, l, r, mid, n - mid);
    }
}
