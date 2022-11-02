import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int h=1;
            int n = in.nextInt();
            for(int i=0;i<n;i++) {
                if(i%2==0)
                    h*=2;
                else
                    h+=1;
            }
            System.out.println(h);
        }
    }
}
