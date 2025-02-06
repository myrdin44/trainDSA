public class maximumNumberOfOperationsWithTheSameScoreI {
    public int maxOperations(int[] nums) {
        int operations = 1;
        int i = 2;
        int current = nums[0] + nums[1];


        while(i < nums.length - 1) {
            if (nums[i] + nums[i + 1] == current) {
                operations++;
                i+= 2;
            }
            else {
                return operations;
            }

        }

        return operations;
    }
}
