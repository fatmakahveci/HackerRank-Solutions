import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++) {
            ar[i]=scan.nextInt();
        }
        
        int swap_cnt=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n-1;j++) {
                if(ar[j]>ar[j+1]) {
                    int temp=ar[j+1];
                    ar[j+1]=ar[j];
                    ar[j]=temp;
                    swap_cnt++;
                }
            }
        }
        
        System.out.println("Array is sorted in "+swap_cnt+" swaps.");
        System.out.println("First Element: "+ar[0]);
        System.out.println("Last Element: "+ar[n-1]);
    }
}
