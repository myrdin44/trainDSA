package week8;

public class addBinary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry; // Start with the carry from the previous operation

            // Add the corresponding bit from string a, if available
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            // Add the corresponding bit from string b, if available
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            // Append the current bit (sum % 2) to the result
            result.append(sum % 2);

            // Calculate the new carry (sum / 2)
            carry = sum / 2;
        }

        if (carry != 0) {
            result.append(carry);
        }

        return result.reverse().toString();
    }
}
