package week11;

public class checkIfItIsAStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length <= 2) {
            return true;
        }
        //y1 = ax1 + b
        //y2 = ax2 + b

        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];

        double a = (double) (y2 - y1) / (x2 - x1);

        double b = (double)y1 - (a * (double) x1);

    for (int i = 2; i < coordinates.length; i++) {
        int x = coordinates[i][0];
        int y = coordinates[i][1];

        // (y1 - y0) * (x - x0) == (y - y0) * (x1 - x0)
        if ((y2 - y1) * (x - x1) != (y - y1) * (x2 - x1)) {
            return false;
        }
    }

        return true;
    }
}