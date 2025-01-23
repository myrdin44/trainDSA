package week17;

public class removeTrailingZerosOfAString {
    public String removeTrailingZeros(String num) {
        int index = num.length() - 1;

        while (index > -1) {
            if (num.charAt(index) == '0') {
                num = num.substring(0,index);
                index--;
            }
            if (num.charAt(index) != '0') {
                return num;
            }
        }

        return num;
    }
}
