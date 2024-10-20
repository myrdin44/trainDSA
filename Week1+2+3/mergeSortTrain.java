
public class mergeSortTrain{
    public static void merge(int array[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int Left [] = new int[n1];
        int Right [] = new int[n2];

        for (int i = 0; i < n1; i++) {
            Left[i] = array[l + i];
        }
        for (int j = 0; j < n2; j++) {
            Right[j] = array[m + j + 1];
        }
        System.out.println("------------------------------");
        printArr(Left);
        printArr(Right);
        System.out.println("------------------------------");


        int i = 0, j = 0;
        int k = 1;

        while (i < n1 && j < n2) {
            if(Left[i] <= Right[j]) {
                array[k++] = Left[i++];
            } else {
                array[k++] = Right[j++];
            }
        }
        while (i < n1) {
            array[k++] = Left[i++];
        }
        while (j < n2) {
            array[k++] = Right[j++];
        }
    }

    public static void mergeSort(int array [], int l, int r) {
        if (l < r) {
            //Find the middle point
            int m = l + (r - l)/2;

            //Sort the left and right halves
            mergeSort(array, l, m);
            mergeSort(array, m + 1, r);

            //Merge two sorted halves   
            merge(array, l, m, r);
        }
    }

    public static void printArr(int arra []) {
        for (int element : arra) {
            System.out.printf("%d, ", element);
        }
        System.out.println("");

    }
    public static void main(String [] args) {
        int array [] = {6, 9, 14, 1, 4, 8, 12, 456, 415, 212, 84, 21, 87, 5, 656, 12, 323654, 15465, 13, 6565};

        mergeSort(array, 0, array.length - 1);

        for (int element : array) {
            System.out.printf("%d -> ",element);
        }
    }
}