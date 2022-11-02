import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String sentence=scan.next();
        int k=scan.nextInt();
        String min=sentence.substring(0,k), max=min;
        
        for(int i=1;i<sentence.length()-k+1;i++) {
            String piece=sentence.substring(i,i+k);
            if(piece.compareTo(min)<0)
                min=piece;
            if(piece.compareTo(max)>0)
                max=piece;
        }
        System.out.println(min+"\n"+max);
    }
}
