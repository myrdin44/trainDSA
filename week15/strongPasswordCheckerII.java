package week15;

public class strongPasswordCheckerII {
    public boolean strongPasswordCheckerII(String password) {
        boolean isLong = false;
        boolean isContainLower = false;
        boolean isContainUpper = false;
        boolean isContainDigit = false;
        boolean isContainSpecial = false;
        boolean isViolateAdjacent = false;

        char ch [] = password.toCharArray();

        if (password.length() >= 8) {
            isLong = true;
        }

        if (password.toUpperCase() != password) {
            isContainLower = true;
        }

        if (password.toLowerCase() != password) {
            isContainUpper = true;
        }

        for (char ach : ch) {
            if (Character.isDigit(ach)) {
                isContainDigit = true;
                break;
            }
        }

        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == ch[i+1]) {
                isViolateAdjacent = true;
            }
        }

        for (int i = 0; i < ch.length; i++) {
			int asciiVal = (int) ch[i];
			if ((asciiVal >= 32 && asciiVal <= 47) || (asciiVal >= 58 && asciiVal <= 64)
					|| (asciiVal >= 91 && asciiVal <= 96) || (asciiVal >= 123 && asciiVal <= 126)) {
				isContainSpecial = true;
				break;
			}
        }

        return (isLong && isContainLower && isContainUpper && isContainDigit && !isViolateAdjacent && isContainSpecial);

    }
}
