package week8;

public class multiplyStrings {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m + n]; // Result array luu cac gia tri tich

        // nhan moi ki tu tu num1 voi num2
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + result[i + j + 1]; // Add tich hien tai vao vi tri
                result[i + j + 1] = sum % 10; // luu so chia het
                result[i + j] += sum / 10; // xu li voi tich lon hon 
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int r : result) {
            if (!(sb.length() == 0 && r == 0)) { // Skip so 0 dau tien
                sb.append(r);
            }
        }

        return sb.toString();
    }
}
