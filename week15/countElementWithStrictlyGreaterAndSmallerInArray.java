package week15;

public class countElementWithStrictlyGreaterAndSmallerInArray {
    public int countElements(int[] nums) {
        if (nums == null || nums.length < 3) {
            return 0;
        }
        
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        int count = 0;
        for (int num : nums) {
            if (num > min && num < max) {
                count++;
            }
        }
        
        return count;
    }
}
