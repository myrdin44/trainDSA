package week16;

public class takeGiftsFromTheRichestPile {
    public long pickGifts(int[] gifts, int k) {
        long currentMax = findMax(gifts);

        for (int t = 0; t < k; t++) {
            for (int i = 0; i < gifts.length; i++) {
                if (gifts[i] == currentMax) {
                    gifts[i] = (int)Math.sqrt(gifts[i]);
                    currentMax = findMax(gifts);
                    break;
                }
            }
        }

        long remain = 0;
        for (int gift : gifts) {
            remain += (long)gift;
        }

        return remain;
    }

    private long findMax(int arr[]) {
        long max = 0;
        for (int num : arr) {
            if ((long)num > max) {
                max = num;
            }
        }

        return max;
    }
}
