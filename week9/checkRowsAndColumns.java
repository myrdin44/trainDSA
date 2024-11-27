package week9;

import java.util.HashSet;
import java.util.Set;

public class checkRowsAndColumns {
    public boolean checkValid(int[][] matrix) {
    int n = matrix.length;

    for (int i = 0; i < n; i++) {
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();

        for (int j = 0; j < n; j++) {
            // Kiểm tra hàng
            if (!rowSet.add(matrix[i][j])) {
                return false; // Có phần tử trùng lặp trong hàng
            }

            // Kiểm tra cột
            if (!colSet.add(matrix[j][i])) {
                return false; // Có phần tử trùng lặp trong cột
            }
        }

        // Đảm bảo rằng tất cả giá trị từ 1 đến n đều xuất hiện
        if (rowSet.size() != n || colSet.size() != n) {
            return false;
        }
    }

    return true;
    }
}
