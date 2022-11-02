import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        
        int[] apple = new int[m];
        int apple_count=0;
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            int apple_position=a+apple[apple_i];
            if(apple_position>=s && apple_position<=t)
                apple_count++;
        }
        System.out.println(apple_count);
        
        int[] orange = new int[n];
        int orange_count=0;
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            int orange_position=b+orange[orange_i];
            if(orange_position>=s && orange_position<=t)
                orange_count++;
        }
        System.out.println(orange_count);
    }
}
