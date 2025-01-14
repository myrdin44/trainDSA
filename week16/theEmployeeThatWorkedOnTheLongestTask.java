package week16;

public class theEmployeeThatWorkedOnTheLongestTask {
    public int hardestWorker(int n, int[][] logs) {
        int currentEnd = 0;
        int longest = 0;
        int emp = -1;

        for (int log [] : logs) {
            if (log[1] - currentEnd > longest) {
                longest = log[1] - currentEnd;
                emp = log[0];
            }
            if (log[1] - currentEnd == longest) {
                if (log[0] < emp) {
                    emp = log[0];
                }
            }
            currentEnd = log[1];
        }

        return emp;
    }
}
