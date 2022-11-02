import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        int Q=scan.nextInt();
        
        List<Integer>[] seqList = new List[N];
        for(int i=0;i<N;i++) {
            seqList[i]=new ArrayList<Integer>();
        }
        
        int lastAns=0;
        for(int i=0;i<Q;i++) {
            int s=scan.nextInt();
            int x=scan.nextInt();
            int y=scan.nextInt();
            int index=(x^lastAns)%N;
            List<Integer> seq=seqList[index];
            if(s ==1)
                seq.add(y);
            if(s == 2) {
                lastAns=seq.get(y%(seq.size()));
                System.out.println(lastAns);
            }
        }
        
    }
}
