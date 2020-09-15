import javax.swing.*;

public class Gym {
  public static void main (String[] arg) {
    String s = JOptionPane.showInputDialog("Pris för månadskort?"); // 930kr
    double månadsKort = Double.parseDouble(s);
    s = JOptionPane.showInputDialog("Pris för biljett?"); // 37kr
    double biljett = Double.parseDouble(s);
    s = JOptionPane.showInputDialog("Antal resor per månad");
    int antal = Integer.parseInt(s);
    if (månadsKort < antal*biljett)
      JOptionPane.showMessageDialog(null, "Årskort är billigast");
    else
      JOptionPane.showMessageDialog(null, "Biljetter är billigast");
  }
}
