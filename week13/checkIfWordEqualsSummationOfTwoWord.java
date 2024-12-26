package week13;

public class checkIfWordEqualsSummationOfTwoWord {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int firstValue = getNumericValue(firstWord);
        int secondValue = getNumericValue(secondWord);
        int targetValue = getNumericValue(targetWord);

        return firstValue + secondValue == targetValue;
    }

    public int getNumericValue(String word) {
        StringBuilder numericVal = new StringBuilder();
        for (char ch : word.toCharArray()) {
            numericVal.append(ch - 'a');
        }
        return Integer.parseInt(numericVal.toString());
    }
}
