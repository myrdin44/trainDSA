package week14;

public class finalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        
        for (String op : operations) {
            //increment or decrement operation
            if (op.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }
        
        return x;
    }
}
