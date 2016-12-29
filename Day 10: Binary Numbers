import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int n=scan.nextInt();
        int b_size=(int)Math.sqrt(n)+1;
        int[] ar=new int[b_size];
        int j=0;
        while(j<b_size) {
            ar[j]=n%2;
            n/=2;
            j++;
        }
        
        int max_length = 0, temp_length = 0;
        for(int i=0;i<b_size;i++) {
            if (ar[i]==1) {
                temp_length++;
            } else {
                temp_length = 0;
            }
            if (temp_length>max_length) {
                max_length=temp_length;
            }
        }
        System.out.println(max_length);
    }
}
