
package Valid_Parentheses_Q20_Easy;

/**
 * This solution was inspired by a question from my University Year 1 Semester 2 DSA Java module.
 *
 * After reading the problem, I immediately recognized it as a classic stack-based problem
 * (valid parentheses / bracket matching), so I applied the same concept I learned in class.
 *
 * I implemented my own Stack class instead of using built-in Java collections to better
 * understand how stack operations (push, pop, isEmpty) work internally.
 *
 * This helped me successfully solve the problem using LIFO (Last In, First Out) logic.
 */
import java.util.Scanner;

class Solution {

    class Stack {
        private char[] stackArray;
        private int top;

        public Stack(int size) {
            stackArray = new char[size];
            top = -1;
        }

        public void push(char ch) {
            stackArray[++top] = ch;
        }

        public char pop() {
            return stackArray[top--];
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    public boolean isValid(String s) {
        Stack stack = new Stack(s.length());

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with parentheses: ");
        String input = sc.nextLine();

        Solution sol = new Solution();
        boolean result = sol.isValid(input);

        System.out.println(result);

        sc.close();
    }
}
