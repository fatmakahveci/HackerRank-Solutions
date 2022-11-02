import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        if(s.length()!=0){
        String delimiters = "[ !,?._'@]+";
        System.out.println(s.split(delimiters).length);
        for(String token:s.split(delimiters))
            System.out.println(token);
        }
        else
            System.out.println("0");
    }
}
