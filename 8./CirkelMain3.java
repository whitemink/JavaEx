import javax.swing.*;

public class CirkelMain3 {
  public static void main (String[] arg) {
    String s;
    s = JOptionPane.showInputDialog("Radien?");
    double r = Double.parseDouble(s);
    double omkr = Cirkel.omkretsen(r);
    double area = Cirkel.arean(r);
    JOptionPane.showMessageDialog(null, 
                "Omkrets: " + omkr + "\nArea: " + area);
  }
}


class Cirkel {
    public static double omkretsen(double r) {
      return 2 * 3.1415926536 * r;
    }
  
    public static double arean(double r) {
      return 3.1415926536 * r * r;
    }
  }