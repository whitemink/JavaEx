import javax.swing.*;


public class BooleanTest {
    public static void main(String[] arg) {
     boolean b1, b2;

     JOptionPane.showMessageDialog(null, "Boolean Type in Java");
     b1 = true;
     if(b1)
     JOptionPane.showMessageDialog(null, "This is true and will get displayed!");
    
     
     b2 = false;
     if(b2)
     JOptionPane.showMessageDialog(null, "This is false and won't get displayed!");
     }
  }