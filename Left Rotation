import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int d=scan.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++) {
            ar[i]=scan.nextInt();
        }
        for(int i=0;i<d;i++) {
            int temp=ar[0];
            for(int j=1;j<n;j++) {
                ar[j-1]=ar[j];
            }
            ar[n-1]=temp;
        }
        for(int i=0;i<n;i++) {
            System.out.print(ar[i]+" ");
        }
    }
}
