public class merge2 {
    public static void merge(
        int[] a, int[] l, int[] r, int left, int right) {
       
          int i = 0, j = 0, k = 0;
          while (i < left && j < right) {
              if (l[i] <= r[j]) {
                  a[k++] = l[i++];
              }
              else {
                  a[k++] = r[j++];
              }
          }
          while (i < left) {
              a[k++] = l[i++];
          }
          while (j < right) {
              a[k++] = r[j++];
          }
      }

      public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
    
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
    
        merge(a, l, r, mid, n - mid);
    }

    public static void main(String [] args) {
        int array [] = {6, 9, 14, 1, 4, 8, 12, 456, 415, 212, 84, 21, 87, 5, 656, 12, 323654, 15465, 13, 6565};

        mergeSort(array, array.length);

        for (int element : array) {
            System.out.printf("%d -> ",element);
        }

    }
}
