import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> sockList = new ArrayList<Integer>();
        int c=0;
        for(int c_i=0; c_i < n; c_i++){
            int cur=in.nextInt();
            if(sockList.contains(cur)){
                sockList.remove(sockList.indexOf(cur));
                c++;
            }
            else {
                sockList.add(cur);
            }
        }
        System.out.println(c);
    }
}
