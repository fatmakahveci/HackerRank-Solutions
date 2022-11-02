import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
        int[] alphabet=new int[26];
        for(int i=0;i<26;i++) {
            alphabet[i]=0;
        }
        for(int i=0;i<first.length();i++) {
            alphabet[first.charAt(i)-'a']++;
        }
        for(int i=0;i<second.length();i++) {
            alphabet[second.charAt(i)-'a']--;
        }
        int sum=0;
        for(int i=0;i<26;i++)
            sum+=Math.abs(alphabet[i]);
        return sum;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
