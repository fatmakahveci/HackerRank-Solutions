import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        List<String> magazine = new ArrayList<String>();
        for(int i=0;i<m;i++){
            magazine.add(in.next());
        }
        List<String> ransom_note = new ArrayList<String>();
        for(int i=0;i<n;i++){
            ransom_note.add(in.next());
        }
        int i=n-1;
        boolean isContained=true;
        while(i>=0){
            String element=ransom_note.get(i);
            if(magazine.contains(element)) {
                magazine.remove(element);
                ransom_note.remove(i);
            }
            else {
                System.out.println("No");
                isContained=false;
                break;
            }
            i--;
        }
        if(isContained)
            System.out.println("Yes");
        
    }
}
