import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q=scan.nextInt();
        for(int k=0;k<q;k++) {
        int n=scan.nextInt();
        int[][] array=new int[2*n][2*n];
        for(int i=0;i<2*n;i++) {
            for(int j=0;j<2*n;j++) {
                array[i][j]=scan.nextInt();
            }
        }
        
        int[][] maxArray = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                int temp=array[i][j];
                if(temp<array[2*n-i-1][j])
                    temp=array[2*n-i-1][j];
                if(temp<array[i][2*n-j-1])
                    temp=array[i][2*n-j-1];
                if(temp<array[2*n-i-1][2*n-j-1])
                    temp=array[2*n-i-1][2*n-j-1];
                maxArray[i][j]=temp;
            }
        }
        int maxSum=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                maxSum+=maxArray[i][j];
            }
        }
        System.out.println(maxSum);
        }
    }
}
