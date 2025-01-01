package week12;

public class checkIfAllIntegersInARangeAreCovered {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean[] covered = new boolean[51];

        for (int[] range : ranges) {
            int start = range[0];
            int end = range[1];
            for (int i = start; i <= end; i++) {
                covered[i] = true;
            }
        }

        // kiem tra neu tat ca so trong khoang left - right da duoc tinh
        for (int i = left; i <= right; i++) {
            if (!covered[i]) {
                return false;
            }
        }

        return true;
    }
}