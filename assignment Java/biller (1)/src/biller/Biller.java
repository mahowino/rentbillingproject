
package biller;

import javax.swing.JOptionPane;

public class Biller {
//declaration of variables
private static long time,chargabletime;
private static Time java=new Time();
private static double second=1000.00;

public static void main(String[] args) {
    //start the new call
   time=newcall();
   
   Money money=new Money(time);
   money.charge();
   JOptionPane.showMessageDialog(null,"your call started at"+java.getCurrenthourtime()+":"+java.getCurrentMinute());
   JOptionPane.showMessageDialog(null,"your call lasted"+(java.getduration())/second+"seconds");
   JOptionPane.showMessageDialog(null,"your charge is"+money.getcharge());
   
   
        
        
    }
    public static long newcall(){
    int start =Integer.parseInt(JOptionPane.showInputDialog("write 1 to start the call"));
    if(start==1){
    Caller call=new Caller();
    call.startcall();
    
   chargabletime=call.ongoingcall();
    }
    else{
     JOptionPane.showMessageDialog(null,"write a correct value");
     newcall();
    
    }
    return chargabletime;
    }
    
}
