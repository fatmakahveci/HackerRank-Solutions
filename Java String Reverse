import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char[] A_reverse=new char[A.length()];
        for(int i=0;i<A.length();i++) {
            A_reverse[i]=A.charAt(A.length()-i-1);
        }
        boolean isEqual=true;
        for(int i=0;i<A.length();i++) {
            if(A.charAt(i)!=A_reverse[i])
                isEqual=false;
        }
        if(isEqual)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
