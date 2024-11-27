package week9;

class lengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.replaceAll("\\s+", " ");

        String result [] = s.split(" ");

        return result[result.length - 1].length();
    }
}