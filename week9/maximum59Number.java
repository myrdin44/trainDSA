package week9;

class maximum69Number {
    public int maximum59Number (int num) {
        char[] numChars = Integer.toString(num).toCharArray();

        // Iterate through the character array
        for (int i = 0; i < numChars.length; i++) {
            // Change the first '6' to '9'
            if (numChars[i] == '6') {
                numChars[i] = '9';
                break;
            }
        }

        return Integer.parseInt(new String(numChars));
    }
}