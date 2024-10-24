//Lam trong 20p, submit 9 lan
class mergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1 [] = new int[m];
        for (int i = 0; i < m; i++) {
            n1[i] = nums1[i];
        }
        int index1 = 0, index2 = 0, k = 0;
        while(index1 < m && index2 < n) {
            if(n1[index1] <= nums2[index2]) {
                nums1[k++] = n1[index1++];
            } else {
                nums1[k++] = nums2[index2++];
            }
        }
        while(index1 < m) {
            nums1[k++] = n1[index1++];
        }
        while(index2 < n) {
            nums1[k++] = nums2[index2++];
        }
    }
}