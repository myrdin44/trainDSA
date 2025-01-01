package week14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class twoOutOfThree {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> freq1 = new HashSet<>();
        Set<Integer> freq2 = new HashSet<>();
        Set<Integer> freq3 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for(int num : nums1) {freq1.add(num);}
        for(int num : nums2) {freq2.add(num);}
        for(int num : nums3) {freq3.add(num);}

        for (int num : nums1) {
            if (freq2.contains(num) || freq3.contains(num)) {
                result.add(num);
            }
        }

        for (int num : nums2) {
            if (freq3.contains(num)) {
                result.add(num);
            }
        }


        return new ArrayList<>(result);
    }
}
