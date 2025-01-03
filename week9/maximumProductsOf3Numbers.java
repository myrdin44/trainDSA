package week9;

public class maximumProductsOf3Numbers {
    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
    
        for (int num : nums) {
            //top 3 lon nhat
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
    
            //top 3 nho nhat
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
    
        int product1 = max1 * max2 * max3;
        int product2 = min1 * min2 * max1;
    
        return Math.max(product1, product2);
        }
}
