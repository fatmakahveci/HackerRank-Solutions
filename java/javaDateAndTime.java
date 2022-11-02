import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.time.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int month=scan.nextInt();
        int day=scan.nextInt();
        int year=scan.nextInt();
        Calendar calendar = new GregorianCalendar(year,month-1,day-1);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String[] dayOfWeekStr={"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
        System.out.println(dayOfWeekStr[dayOfWeek-1]);
    }
}
