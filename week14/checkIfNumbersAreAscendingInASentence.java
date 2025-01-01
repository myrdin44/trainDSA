package week14;

import java.util.ArrayList;

public class checkIfNumbersAreAscendingInASentence {
    public boolean areNumbersAscending(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        String words [] = s.split(" ");

        ArrayList<Integer> sequence = new ArrayList<>();

        for (String word : words) {
            if(Character.isDigit(word.charAt(0))) {
                sequence.add(Integer.parseInt(word));
            }
        }

        for (int i = 0; i < sequence.size() - 1; i++) {
            if (sequence.get(i) >= sequence.get(i+1)) {
                return false;
            }
        }

        return true;
    }
}
