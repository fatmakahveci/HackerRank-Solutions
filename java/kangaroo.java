import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        boolean isAble=false;
        while((x2>x1 && v1>v2) || (x1>x2 && v2>v1) ) {
            x1+=v1;
            x2+=v2;
            if(x1 == x2){
                isAble=true;
                break;
            }
            else {
                isAble=false;
            }
        }
        if (isAble)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
