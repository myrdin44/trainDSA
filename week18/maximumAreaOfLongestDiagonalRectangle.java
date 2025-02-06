public class maximumAreaOfLongestDiagonalRectangle {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonal = 0;
        int maxArea = 0;
        
        for (int[] dimension : dimensions) {
            double diagonal = calDiagonal(dimension[0], dimension[1]);
            int area = dimension[0] * dimension[1];
            
            if (diagonal > maxDiagonal) {
                maxDiagonal = diagonal;
                maxArea = area;
            }
            else if (diagonal == maxDiagonal && area > maxArea) {
                maxArea = area;
            }
        }
        
        return maxArea;
    }

    private double calDiagonal(int length, int width) {
        double l = (double) length * (double) length;
        double w = (double) width * (double) width;

        return Math.sqrt(l+w);
    }
}
