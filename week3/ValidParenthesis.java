package week3;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '(' :  stack.push(ch);
                case '{':  stack.push(ch);
                case '[' : stack.push(ch);
                case ')' : {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                }
                case '}' : {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                }
                case ']' : {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                }
            }
        }
        
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s= "({}";
        System.out.println(isValid(s));
    }
}
