import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int e=scan.nextInt();
        int n=scan.nextInt();
        int[] ar=new int[n];
        int c=0;
        for(int i=0;i<n;i++) {
            ar[i]=scan.nextInt();
            if(ar[i]<e)
                c++;
        }
        System.out.println(c);
    }
}
