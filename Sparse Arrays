import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        String[] ar = new String[n];
        for(int i=0;i<n;i++) {
            ar[i]=scan.next();
        }
        
        int q=scan.nextInt();
        for(int i=0;i<q;i++) {
            String query=scan.next();
            int c=0;
            for(int j=0;j<n;j++) {
                if(ar[j].equals(query))
                    c++;
            }
            System.out.println(c);
        }
    }
}
