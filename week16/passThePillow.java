package week16;

public class passThePillow {
    public int passThePillow(int n, int time) {
        int cycle = 2 * (n - 1);
        time = time % cycle;
        
        if (time < n - 1) {
            return time + 1;
        }
        return n - (time - (n - 1));
    }
}
