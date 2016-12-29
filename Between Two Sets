import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean hasFactor(int i, int ar[]) {
        for(int j=0;j<ar.length;j++) {
            if (ar[j]%i!=0)
                return false;
        }
        return true;
    }
    
    public static boolean isFactor(int i, int ar[]) {
        for(int j=0;j<ar.length;j++) {
            if(i%ar[j]!=0)
                return false;  
        }
        return true;
    }
    
    public static int min_value(int[] ar) {
        int min_a=Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++) {
            if(ar[i]<min_a)
                min_a=ar[i];
        }
        return min_a;
    }
    
    public static int max_value(int[] ar) {
        int max_a=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++) {
            if(ar[i]>max_a)
                max_a=ar[i];
        }
        return max_a;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int m = in.nextInt();
        
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        
        int min_b=min_value(b);
        int max_a=max_value(a);
        
        int counter=0;
        for(int i=max_a;i<=min_b;i++) {
            if(isFactor(i,a) && hasFactor(i,b))
                counter++;
        }
        System.out.println(counter);
    }
}
