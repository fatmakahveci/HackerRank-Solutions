import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int t1=scan.nextInt();
        int t2=scan.nextInt();
        
        int n=scan.nextInt();

        BigInteger[] ar=new BigInteger[n];
        ar[0]=BigInteger.valueOf(t1);
        ar[1]=BigInteger.valueOf(t2);
        for(int i=2;i<n;i++) {
            ar[i]=ar[i-1].multiply(ar[i-1]).add(ar[i-2]);
        }
        System.out.println(ar[n-1]);
    }
}
