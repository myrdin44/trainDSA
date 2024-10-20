class singleNumber {
    private void merge(int arr[], int left [], int right [], int lSize, int rSize) {
        int i = 0, j = 0, k = 0;
        while(i < lSize && j < rSize) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while(i < lSize) {
            arr[k++] = left[i++];
        }
        while (j < rSize) {
            arr[k++] = right[j++];
        }
    }
    private void mergeSort(int arr[], int size) {
        if (size < 2) {
            return;
        }
        int mid = size / 2;
        int left [] = new int[mid];
        int right [] = new int[size - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int j = mid; j < size; j++) {
            right[j - mid] = arr[j];
        }

        mergeSort(left, mid);
        mergeSort(right, size - mid);
        merge(arr, left, right, mid, size - mid);
    }
    public int singleNumberSolve(int[] nums) {
        mergeSort(nums, nums.length);
        for (int i = 0; i < nums.length - 1; i++) {
            if(i % 2 == 0 && nums[i] != nums[i+1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}