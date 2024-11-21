package week8;

import java.util.HashMap;
import java.util.Map;

public class romanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> mapRoman = new HashMap<>();
        mapRoman.put('I', 1);
        mapRoman.put('V', 5);
        mapRoman.put('X', 10);
        mapRoman.put('L', 50);
        mapRoman.put('C', 100);
        mapRoman.put('D', 500);
        mapRoman.put('M', 1000);

        int getInt = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (mapRoman.get(s.charAt(i)) < mapRoman.get(s.charAt(i + 1))) {
                getInt -= mapRoman.get(s.charAt(i));
            } else {
                getInt += mapRoman.get(s.charAt(i));
            }
        }

        getInt += mapRoman.get(s.charAt(s.length() - 1));

        return getInt;
    }
}
