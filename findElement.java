import java.util.Scanner;

public class findElement {
    
    public static void main(String [] args) {

        Scanner getData = new Scanner(System.in);

        System.out.printf("Enter number of elements: ");
        int n = getData.nextInt();

        int test [] = new int[n];
        for (int i = 0; i < n; i++) {
            test[i] = getData.nextInt();
        }

        System.out.println("Enter value want to check: ");
        int searchValue = getData.nextInt();

        mergeSort(test, test.length);

        System.out.printf("Index of Value: %d", binarySearch(test, 0, test.length, searchValue));

        getData.close();
    }

    public static void printArr(int inputArray []) {
        for (int element : inputArray) {
            System.out.printf("%d ,", element);
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
            return ;
        }
        
        int middle = size / 2;
        int left [] = new int[middle];
        int right [] = new int[size - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = array[i];
        }
        for (int j = middle; j < size; j++) {
            right[j - middle] = array[j];
        }

        mergeSort(left, middle);

        mergeSort(right, size - middle);

        merge(array, left, right, middle, size - middle);
    }

    public static int binarySearch(int inputArray [],int left, int right, int searchValue) {

        while (left <= right) {
            int middle = (left + right) / 2;

            if (inputArray[middle] == searchValue) {
                return middle;
            }

            if (inputArray[middle] < searchValue) {
                return binarySearch(inputArray, middle + 1, right, searchValue);
            }

            if (inputArray[middle] > searchValue) {
                return binarySearch(inputArray, left, middle - 1, searchValue);
            }
        }

        return -1;
    }
}
