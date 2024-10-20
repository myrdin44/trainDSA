/**
 * testMergeSort
 */
import java.util.Scanner;

public class testMergeSort {

    public static void main(String[] args) {
        Scanner getData = new Scanner(System.in);
        
        System.out.println("Enter number of elements:");

        int n = getData.nextInt();

        int testCase [] = new int[n];

        for (int i  = 0; i < n; i++) {
            testCase[i] = getData.nextInt();
        }
        mergeSort(testCase, n);

        System.out.println("enter Key:");
        int Key = getData.nextInt();
        System.out.printf("Position of Key: %d", findIndexOfK(testCase, Key, 0, n));


        // mergeSort(testCase, testCase.length);

        // printArr(testCase);

        getData.close();
    }

    // public static void merge(int array[], int left [], int right [], int lSize, int Rsize) {
    //     int i = 0, j = 0, k = 0;

    //     while (i < lSize && j < Rsize) {
    //         if (left[i] >= right[j]) {
    //             array[k++] = left[i++];
    //         } else {
    //             array[k++] = right[j++];
    //         }
    //     }

    //     while (i < lSize) {
    //         array[k++] = left[i++];
    //     }

    //     while (j < Rsize) {
    //         array[k++] = right[j++];
    //     }
    // }

    // public static void mergeSort(int array [], int arrSize) {
    //     if (arrSize < 2) {
    //         return;
    //     }

    //     int mid = arrSize / 2;

    //     int left [] = new int[mid];
    //     int right [] = new int[arrSize - mid];

    //     for (int i = 0 ; i < mid; i++) {
    //         left[i] = array[i];
    //     }

    //     for (int j = mid; j < arrSize; j++) {
    //         right[j - mid] = array[j];
    //     }

    //     mergeSort(left, mid);
    //     mergeSort(right, arrSize - mid);

    //     merge(array, left, right, mid, arrSize - mid);
    // }

    public static void printArr(int array []) {
        for (int element : array) {
            System.out.printf("%d > ", element);
        }
    }

    public static void merge(int array [], int left [], int right [], int lSize, int rSize) {
        int i = 0, j = 0, k = 0;

        while (i < lSize && j < rSize) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < lSize) {
            array[k++] = left[i++];
        }
        while (j < rSize) {
            array[k++] = right[j++];
        }
    }

    public static void mergeSort(int array [], int size) {
        if (size < 2) {
            return;
        }

        int mid = size / 2;

        int left [] = new int[mid];
        int right [] = new int[size - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int j = mid; j < size; j++) {
            right[j - mid] = array[j];
        }

        mergeSort(left, mid);
        mergeSort(right, size - mid);
        merge(array, left, right, mid, size - mid);
    }

    public static int findIndexOfK(int array [], int k, int left, int right) {
        if (left <= right) {
            int middle = (left + right) / 2;
            if (k == array[middle]) {
                return middle + 1;
            }

            if (k > array[middle]) {
                return findIndexOfK(array, k, middle + 1, right);
            }

            if (k < array[middle]) {
                return findIndexOfK(array, k, left, middle - 1);
            }
        }

        return -1;
    }
}