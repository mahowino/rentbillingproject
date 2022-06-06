
package biller;

import java.text.DecimalFormat;

public class Money {
    //declarations
   private static double charge;
   private static final double VAT=0.16;
   private static long time_to_charge;
   private static double seconds=60000.00;
   private static Time time=new Time();
   private static int hour;
   private static DecimalFormat df=new DecimalFormat("0.00");
    public Money(long time) {
        time_to_charge=time;
    }
    public static void chargeVAT(){
    charge+=charge*VAT;
    }
    public static void charge(){
    hour=time.getCurrenthourtime();
    if(hour<18 && hour>=6){
        
        charge=(time_to_charge/seconds)*4;
    if(time_to_charge>seconds){
    
    chargeVAT();
    }
    }
    else{
   
    charge=(time_to_charge/seconds)*3;
    if(time_to_charge>seconds){
    
    chargeVAT();
    }
    
    
    }
    
    }
    public static double getcharge(){
   return Double.parseDouble(df.format(charge));
    }
    
    
    }
        

