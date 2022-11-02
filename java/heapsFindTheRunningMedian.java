import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++) {
            int currentElement=scan.nextInt();
            int position=Collections.binarySearch(list,currentElement);
            if(position<0)
                position=Math.abs(position)-1;
            list.add(position,currentElement);
            if(list.size()%2==1)
                System.out.println((double)list.get(i/2));
            else
                System.out.println((double)(list.get(i/2)+list.get(i/2+1))/2.0);
        }
    }
}
