package week17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class minimumRightShifToSortTheArray {
    public int minimumRightShifts(List<Integer> nums) {
    int n = nums.size();
    
    int rotationPoint = 0;
    int drops = 0;
    
    for (int i = 0; i < n; i++) {
        if (i + 1 < n && nums.get(i) > nums.get(i + 1)) {
            rotationPoint = i + 1;
            drops++;
        }
    }

    if (nums.get(n - 1) > nums.get(0)) {
        drops++;
    }
    
    if (drops > 1) {
        return -1;
    }
    
    if (rotationPoint == 0) {
        return 0;
    }
    
    List<Integer> sorted = new ArrayList<>(nums);
    Collections.sort(sorted);
    List<Integer> rotated = new ArrayList<>(nums);
    
    Collections.rotate(rotated, -rotationPoint);
    
    if (rotated.equals(sorted)) {
        return n - rotationPoint;
    }
    
    return -1;
    }
}
