import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        HashMap<Integer,List> map=new HashMap<Integer,List>();
        for(int i=0;i<n;i++) {
            List<Integer> list=new ArrayList<Integer>();
            int m=scan.nextInt();
            for(int j=0;j<m;j++) {
                list.add(scan.nextInt());
            }
            map.put(i,list);
        }
        int q=scan.nextInt();
        for(int i=0;i<q;i++) {
            int listNo=scan.nextInt()-1;
            int index=scan.nextInt()-1;
            if(index<map.get(listNo).size())
                System.out.println(map.get(listNo).get(index));
            else
                System.out.println("ERROR!");
        }
    }
}
