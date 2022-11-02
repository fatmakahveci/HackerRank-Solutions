import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int like=5/2;
        int sum=like;
        for(int i=1;i<n;i++) {
            like=like*3/2;
            sum+=like;
        }
        System.out.println(sum);
    }
}
