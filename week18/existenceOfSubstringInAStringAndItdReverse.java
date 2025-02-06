public class existenceOfSubstringInAStringAndItdReverse {
    public boolean isSubstringPresent(String s) {
        StringBuilder reverse = new StringBuilder();

        for (int i = s.length() - 1; i > -1; i--) {
            reverse.append(String.valueOf(s.charAt(i)));
        }

        String rev = reverse.toString();

        for (int i = 0; i < s.length() - 1; i++) {
            String substring = s.substring(i, i + 2);

            if (rev.contains(substring)) {
                return true;
            }
        }

        return false;
    }
}
