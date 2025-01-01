package week14;

public class aNumberAfterADoubleReversal {
    public boolean isSameAfterReversals(int num) {
        // If num is 0, return true
        if (num == 0) return true;
        
        // If num ends with 0, return false
        return num % 10 != 0;
     }
}
