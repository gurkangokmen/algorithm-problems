package ValidParentheses;

// https://leetcode.com/problems/valid-parentheses/description/?envType=problem-list-v2&envId=string

import java.util.Stack;

class Solution {
    private char parentheses10 = '(';
    private char parentheses11 = ')';
    private char parentheses20 = '[';
    private char parentheses21 = ']';
    private char parentheses30 = '{';
    private char parentheses31 = '}';
    
    private Stack<Character> stack = new Stack<>();


    public boolean isValid(String s) {
        char[] parentheses = new char[s.length()];
        parentheses = s.toCharArray();

        for (char c : parentheses) {
            if (c == parentheses10 || c == parentheses20 || c == parentheses30) {
                stack.push(c);
            }
            else if (c == parentheses11) {
                if (stack.isEmpty() || stack.peek() != parentheses10) {
                    return false;
                }

                else if (stack.peek() == parentheses10) {
                    stack.pop();
                }
            }
            else if (c == parentheses21) {
                if (stack.isEmpty() || stack.peek() != parentheses20) {
                    return false;
                }

                else if (stack.peek() == parentheses20) {
                    stack.pop();
                }
            }
            else if (c == parentheses31) {
                if (stack.isEmpty() || stack.peek() != parentheses30) {
                    return false;
                }

                else if (stack.peek() == parentheses30) {
                    stack.pop();
                }
            }
        }

        if (stack.size() > 0) {return false;}
        return true;
    }
}