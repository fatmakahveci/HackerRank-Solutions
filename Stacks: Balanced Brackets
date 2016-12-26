import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isBalanced(String expression) {
        Stack stack = new Stack();
        for(int i=0;i<expression.length();i++) {
            char c=expression.charAt(i);
            if(c=='{' || c=='[' || c=='(')
                stack.push(c);
            if(stack.isEmpty()){
					return false;
				}
            if(stack.size()!=0){
                
                if(c=='}' && stack.peek()=='{')
                    stack.pop();
                else if(c==']' && stack.peek()=='[')
                    stack.pop();
                if(c==')' && stack.peek()=='(')
                    stack.pop();
            }
        }
        if(stack.size()==0)
            return true;
        return false;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
