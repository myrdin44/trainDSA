package week13;

public class validMountainArray {
    public boolean validMountainArray(int[] arr) {
        int max = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        if (arr.length < 3 || max == arr[arr.length - 1] || max == arr[0]) {
            return false;
        } 

        for (int k = 1; k <= index; k++) {
            if (arr[k] <= arr[k - 1]) {
                return false;
            }
        }
        for (int l = index + 1; l < arr.length; l++) {
            if (arr[l] >= arr[l - 1]) {
                return false;
            }
        }

        return true;
    }
}
