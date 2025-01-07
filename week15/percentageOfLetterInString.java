package week15;

public class percentageOfLetterInString {
    public int percentageLetter(String s, char letter) {
        int countFreq = 0;
        for (char ch : s.toCharArray()) {
            if (ch == letter) {
                countFreq++;
            }
        }

        return (countFreq * 100)/s.length();
    }
}
