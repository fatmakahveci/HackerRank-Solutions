import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int[] ar=new int[n];
        int sum=0;
        for(int i=0;i<n;i++) {
            ar[i]=scan.nextInt();
            sum+=ar[i];
        }
        int payment=scan.nextInt();
        if(payment==(sum-ar[k])/2)
            System.out.println("Bon Appetit");
        else
            System.out.println(sum/2-(sum-ar[k])/2);
    }
}
