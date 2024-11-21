package week8;

import java.util.HashMap;

public class isomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // s -> t va t -> s
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            if (mapS.containsKey(chS) && mapS.get(chS) != chT) {
                return false;
            }
            if (mapT.containsKey(chT) && mapT.get(chT) != chS) {
                return false;
            }

            mapS.put(chS, chT);
            mapT.put(chT, chS);
        }

        return true;
    }
}
