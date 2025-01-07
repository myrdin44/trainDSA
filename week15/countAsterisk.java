package week15;

public class countAsterisk {
    public int countAsterisks(String s) {
        int countBars = 0;
        int asterisks = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '|') {
                countBars++;
            } else if (ch == '*' && countBars % 2 == 0) {
                asterisks++;
            }
        }

        return asterisks;
    }
}
