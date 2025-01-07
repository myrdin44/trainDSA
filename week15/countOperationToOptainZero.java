package week15;

public class countOperationToOptainZero {
    public int countOperations(int num1, int num2) {
        int operations = 0;

        while (num1 > 0 && num2 > 0) {
            if (num1 >= num2) {
                num1 -= num2;
                operations++;
            }
            else {
                num2 -= num1;
                operations++;
            }
        }

        return operations;
    }
}
