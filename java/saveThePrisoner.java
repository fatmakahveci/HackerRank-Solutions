import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int tour=scan.nextInt();
        for(int i=0;i<tour;i++) {
            int prisoner=scan.nextInt();
            int sweet=scan.nextInt();
            int firstPrisoner=scan.nextInt();
            if(sweet+firstPrisoner-1<=prisoner)
                System.out.println(sweet+firstPrisoner-1);
            else if((sweet+firstPrisoner-1)%prisoner==0)
                System.out.println(prisoner);
            else
                System.out.println((sweet+firstPrisoner-1)%prisoner);
        }
    }
}
