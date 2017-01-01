import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class MyQueue<T> {
    Stack<T> stack1 = new Stack<T>();
    Stack<T> stack2 = new Stack<T>();
    
    public void enqueue(T element) {
        stack1.push(element);
    }
    
    public void dequeue() {
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                T stack_element=stack1.pop();
                stack2.push(stack_element);
            }
        }
        if(!stack2.isEmpty()) {
            stack2.pop();
        }
    }
    
    public T peek() {
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                T stack_element=stack1.pop();
                stack2.push(stack_element);
            }
        }
        if(!stack2.isEmpty()) {
            return stack2.peek();
        }
        return null;
    }
}

public class Solution {
    
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
