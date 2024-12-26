package week13;

import java.util.Arrays;
import java.util.Comparator;

public class largestNumber {
    public String largestNumber(int[] nums) {
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }
        
        Comparator<String> customComparator = (a, b) -> {
            String order1 = a + b;
            String order2 = b + a;
            return order2.compareTo(order1);
        };
        
        Arrays.sort(strNums, customComparator);
        
        if (strNums[0].equals("0")) {
            return "0";
        }
        
        StringBuilder result = new StringBuilder();
        for (String str : strNums) {
            result.append(str);
        }
        
        return result.toString();
    }
}
