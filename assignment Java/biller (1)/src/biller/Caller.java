
package biller;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Caller {
    private static long ending;
    private static int signal;
    private static Time starttime;
    private static JFrame frame=new JFrame();
    
      public Caller() {
          starttime=new Time();
    }
      public static void startcall(){
      
      starttime.getstarttime();
       }
      public static long ongoingcall(){
      
      frame.setTitle("Call ongoing");
      frame.setSize(300,300);
      JTextField field=new JTextField();
      field.setText("call started... counting minutes");
      field.setEditable(false);
      frame.add(field);
      frame.show(true);
      
      endcall();
      return ending;
       }
      public static void endcall(){
       signal=Integer.parseInt(JOptionPane.showInputDialog("write a number 2 to end call"));
        
      if(signal==2){
          frame.show(false);
      
      starttime.getendtime();
      ending=starttime.getduration();
      
      }
      else{
      JOptionPane.showMessageDialog(null,"you have entered a wrong value");
      endcall();
      
      }
      
      }
      
     
   
      
              
      
    
}

  
