import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i=scan.nextInt();
        int j=scan.nextInt();
        int k=scan.nextInt();
        int c_r, counter=0;
        for(int c=i;c<=j;c++) {
            c_r=Integer.parseInt(new StringBuffer(String.valueOf(c)).reverse().toString());
            if((c-c_r)%k==0)
                counter++;
        }
        System.out.println(counter);
    }
}
