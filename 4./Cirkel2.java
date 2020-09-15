import javax.swing.*;

public class Cirkel2 {
  public static void main (String[] arg) {
    double r = 0;
    boolean försökIgen = true;
    String s = JOptionPane.showInputDialog("Radien?");
    while (försökIgen) {
      if (s == null)
        System.exit(0);
       try {
         r = Double.parseDouble(s);
         if (r > 0)
           försökIgen = false;
         else
           s = JOptionPane.showInputDialog("Radien måste vara > 0!\nRadien?");
       }
       catch (NumberFormatException e) {
         s = JOptionPane.showInputDialog("Felaktigt tal!\nRadien?");
       }
    }         
    double omkr = 2 * 3.1415926536 * r;
    double area = 3.1415926536 * r * r;
    JOptionPane.showMessageDialog(null, 
                "Omkrets: " + omkr + "\nArea: " + area);
  }
}