package stack;

import java.util.LinkedList;

public class ValidParentheses {
    public static boolean isValid(String s) {
        //стек на LinkedList
        LinkedList<Character> stack = new LinkedList();

        for (int i = 0; i < s.length(); i++) {


            if (stack.size() == 0) {
                if((s.charAt(i) == ']') || (s.charAt(i) == '}') || (s.charAt(i) == ')')) {
                    return false;
                }
                stack.addLast(s.charAt(i));
            } else {
                switch (stack.getLast()) {
                    case '(':
                        if (s.charAt(i) == ')') {
                            stack.removeLast();
                        } else if (s.charAt(i) == ']') {
                            return false;
                        } else if (s.charAt(i) == '}') {
                            return false;
                        } else {
                            stack.addLast(s.charAt(i));
                        }
                        break;
                    case '[':
                        if (s.charAt(i) == ']') {
                            stack.removeLast();
                        } else if (s.charAt(i) == ')') {
                            return false;
                        } else if (s.charAt(i) == '}') {
                            return false;
                        } else {
                            stack.addLast(s.charAt(i));
                        }
                        break;
                    case '{':
                        if (s.charAt(i) == '}') {
                            stack.removeLast();
                        } else if (s.charAt(i) == ']') {
                            return false;
                        } else if (s.charAt(i) == ')') {
                            return false;
                        } else {
                            stack.addLast(s.charAt(i));
                        }
                        break;
                }

            }


        }
        if (stack.size() != 0) {
            return false;
        }
        return true;
    }
}
