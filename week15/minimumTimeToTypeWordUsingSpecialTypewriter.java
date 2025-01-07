package week15;

public class minimumTimeToTypeWordUsingSpecialTypewriter {
    public int minTimeToType(String word) {
        //initialize operations and convert
        int operations = 0;
        char current = 'a';

        for (char ch : word.toCharArray()) {
            int diff = Math.abs(current - ch);
            int distance = Math.min(diff, 26 - diff);
            
            operations += distance + 1;
            current = ch;
        }
        
        return operations;
    }
}
