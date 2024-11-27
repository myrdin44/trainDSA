package week9;

import java.util.Stack;

public class validParenthese {
    public boolean isValid(String s) {
        Stack<Character> pool = new Stack<>(); // tao stack de luu cac ngoac mo

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                pool.push(ch);
            } else {
                if (pool.isEmpty()) {
                    return false;
                }

                char top = pool.pop();
                if (top == '(' && ch != ')' ||
                    top == '{' && ch != '}' ||
                    top == '[' && ch != ']'
                ) {
                    return false;
                }
            }
        }

        return pool.isEmpty();
    }
}
