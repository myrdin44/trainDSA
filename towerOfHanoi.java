public class towerOfHanoi {
    public static void solveHanoi(int n, char fromPane, char toPane, char supportPane) {
        if (n == 1) {
            System.out.println("Move pane " + fromPane + " to pane " + toPane);
            return;
        }

        solveHanoi(n - 1, fromPane, supportPane, toPane);

        System.out.println("Move pane " + fromPane +" to pane " + toPane);

        solveHanoi(n - 1, supportPane, toPane, fromPane);
    }

    public static void main(String[] args) {
        int n = 4;
        solveHanoi(n, 'A', 'B', 'C');
    }
}
