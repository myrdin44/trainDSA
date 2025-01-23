package week17;

import java.util.Stack;

public class minimumStringLengthAfterRemovingSubstring {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty()) {
                if ((c == 'B' && stack.peek() == 'A') || 
                    (c == 'D' && stack.peek() == 'C')) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }
        
        return stack.size();
    }
}
