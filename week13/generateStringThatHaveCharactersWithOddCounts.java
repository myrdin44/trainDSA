package week13;

public class generateStringThatHaveCharactersWithOddCounts {
    public String generateTheString(int n) {
        String aChar = "a";
        String bChar = "b";
        if (n % 2 != 0) {
            return aChar.repeat(n);
        } else {
            return aChar.repeat(n - 1) + bChar;
        }
    }
}
