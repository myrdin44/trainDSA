package week9;

public class canPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int countAvailableHole = 0;
        int i = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) && 
                (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1; // Plant a flower
                countAvailableHole++;
                i += 2; // Skip the next spot
            } else {
                i++;
            }
        }

        return (countAvailableHole >= n) ? true : false;
    }
}
