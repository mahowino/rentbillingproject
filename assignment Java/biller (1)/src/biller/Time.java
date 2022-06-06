
package biller;

import java.util.GregorianCalendar;

public class Time {
private static long timeelapsed;
private static long start,finish,duration;
private static int currenthour,currentminute;
private static GregorianCalendar calender=new GregorianCalendar();
    public Time() {
        timeelapsed=0;
        
    }
    public static  void getstarttime(){
    
    start=System.currentTimeMillis();
    }
    public static void getendtime(){
    finish=System.currentTimeMillis();
    }
    public static long getduration(){
   
    duration=finish-start;
    return duration;
    }
    public static int getCurrenthourtime(){
    
    currenthour=calender.get(calender.HOUR_OF_DAY);
    return currenthour;
    }
    public static int getCurrentMinute(){
    
    currentminute=calender.get(calender.MINUTE);
    return currentminute;
    }
    
    
}
