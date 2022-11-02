import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int c[]=new int[n];
        for(int i=0;i<n;i++){
            c[i]=scan.nextInt();
        }
        int energy=100;
        for(int i=0;i<n;i+=k) {
            if(c[i]==0)
                energy-=1;
            else if(c[i]==1)
                energy-=3;
        }
        System.out.println(energy);
    }
}
