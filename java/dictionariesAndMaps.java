//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBookMap = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBookMap.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(phoneBookMap.get(s)==null)
                System.out.println("Not found");
            else
                System.out.println(s+"="+phoneBookMap.get(s));
        }
        in.close();
    }
}
