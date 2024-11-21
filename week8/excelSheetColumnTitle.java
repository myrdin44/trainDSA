package week8;

public class excelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            int r = columnNumber % 26;
            result.append(String.valueOf((char) (r + 'A')));
            columnNumber /= 26;
        }

        return result.reverse().toString();
    }
}
