package week14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortEvenAndOddIndicesIndependently {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> oddIndices = new ArrayList<>();
        List<Integer> evenIndices = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                evenIndices.add(nums[i]);
            } else {
                oddIndices.add(nums[i]);
            }
        }
        
        Collections.sort(evenIndices);
        Collections.sort(oddIndices, Collections.reverseOrder());
        
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = evenIndices.get(evenIndex++);
            } else {
                nums[i] = oddIndices.get(oddIndex++);
            }
        }
        
        return nums;
    }
}
