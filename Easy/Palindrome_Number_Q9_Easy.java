package Palindrome_Number_Q9;
// Problem: Valid Palindrome (LeetCode #9)
//
// Thought Process:
// Initially, I considered solving this using Stack and Queue.(I uploaded those codes as comments.)
// Then I thought about using an array to compare characters.
//Finally,I implemented a simpler approach using
// StringBuilder(s).reverse().toString() and equals().
//
// This helped me understand multiple approaches before choosing the optimal readable solution.
import java.util.Scanner;

    class Solution {
        public boolean isPalindrome(int x) {

            //Converting in "x" to String "s"
            String s = String.valueOf(x);

            //Reverse the String "s"
            String reversed = new StringBuilder(s).reverse().toString();

            //Checking String is Equals to its Reversed String
            if (s.equals(reversed)) {

                return true;

            } else {

                return false;

            }

        }

        public static void main(String[] args) {

            //Creating Scanner object to get user input
            Scanner sc = new Scanner(System.in);

            //Getting user input as Integer
            System.out.println("Enter an Integer for Pailndrome check : ");
            int x = sc.nextInt();

            //Creating Object for Solution.java class
            Solution result = new Solution();

            //Printing result
            System.out.println(result.isPalindrome(x));

        }

    }


//Need Stack class 
//Need Queue class

/*class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor
    public Stack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    // Push element onto stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stack[++top] = value;
    }

    // Pop element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty.");
            return -1;
        }
        return stack[top--];
    }

    // Peek top element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Count elements in stack
    public int count() {
        return top + 1;
    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack elements (top to bottom):");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}//End of stack class*/

/*
class Queue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Constructor
    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue (insert element)
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot insert " + value);
            return;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
    }

    // Dequeue (remove element)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Queue is empty.");
            return -1;
        }

        int value = queue[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    // Peek front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queue[front];
    }

    // Check if empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if full
    public boolean isFull() {
        return size == capacity;
    }

    // Count elements
    public int count() {
        return size;
    }

    // Display queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Queue elements (front to rear):");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity]);
        }
    }
}//End of Queue class
*/

//Idea get an user input and store those in both Array and Queue then remove it one-by-one and check for Palindrome
/*
class Solution {
    public boolean isPalindrome(int x) {

        //Converting int x to string n
        String n = Integer.toString(x);

        //Creating  Stack and Queue object
        //Allocating n.length number of Size to Stack and Queue
        Stack stack = new Stack(n.length());
        Queue queue = new Queue(n.length());

        //Storing element by element in Stack and Queue
        for (int i = 0; i < n.length(); i++) {

            int digit = n.charAt(i) - '0';

            stack.push(digit);
            queue.enqueue(digit);

        }

        while (!stack.isEmpty() && !queue.isEmpty()) {

            if (stack.pop() != queue.dequeue()) {

                return false;

            } else {

                return true;

            }

        }
    }
}

class isPalindrome {

    public static void main(String[] args) {

        //Creating Scanner object to get User input
        Scanner sc = new Scanner(System.in);

        //Getting user input as an integer
        System.out.println("Enter an Integer to Palindrome check : ");
        int x = sc.nextInt();

        Solution solve = new Solution();
        boolean result = solve.isPalindrome(x);

        System.out.println(result);

    }

}
*/