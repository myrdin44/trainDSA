package week9;

import java.util.List;

public class triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        //bat dau lap tu hang thu 2 tu duoi len
        for (int row = triangle.size() - 2; row >= 0; row--) {
            for (int col = 0; col < triangle.get(row).size(); col++) {
                int current = triangle.get(row).get(col);
                int below = triangle.get(row + 1).get(col);
                int belowRight = triangle.get(row + 1).get(col + 1);

                triangle.get(row).set(col, current + Math.min(below, belowRight));

            }
        }

        return triangle.get(0).get(0);
        
    }
}
