package week10;

public class numberOfComplement {
    public int findComplement(int num) {
        int i = 0;
        int comp = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                comp += Math.pow(2,i);
            }
            i++;
            num /= 2;
        }
        return comp;
    }
}
