import java.io.*;
import java.util.*;

public class Solution {
    public static int sum(int n, int k) {
        int g1=n%k;
        int g2=k-g1;
        int sz1=n/k+1;
        int sz2=n/k;
        return g1*sz1*g2*sz2 + g1*(g1-1)*sz1*sz1/2 + g2*(g2-1)*sz2*sz2/2 ;
    }
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        
        for(int i=0;i<t;i++) {
            int n=scan.nextInt();
            int m=scan.nextInt();
            int min=1;
            int max=n;
            int mid;
            while(min<max) {
                mid=(min+max)/2;
                if(sum(n, mid)>=m)
                    max=mid;
                else
                    min=mid+1;
            }
            System.out.println(min);
        }
    }
}
