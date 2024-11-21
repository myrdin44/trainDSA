package week8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class uniqueNumberOfOccurences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();

        // Đếm số lần xuất hiện của mỗi phần tử
        for (int ele : arr) {
            freq.put(ele, freq.getOrDefault(ele, 0) + 1);
        }

        // Tạo một tập hợp để lưu tần suất
        Set<Integer> occurrences = new HashSet<>();

        // Kiểm tra xem tần suất có duy nhất không
        for (int count : freq.values()) {
            if (!occurrences.add(count)) {
                // Nếu không thể thêm (tức là đã tồn tại), return false
                return false;
            }
        }

        return true;
    }
}
