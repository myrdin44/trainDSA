
public class insertionSortTrain {
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int array [] = {6, 9, 14, 1, 4, 8, 12, 456, 415, 212, 84, 21, 87, 5, 656, 12, 323654, 15465, 13, 6565};
        insertionSort(array);
        for (int element : array) {
            System.out.printf("%d -> ",element);
        }
    }
}