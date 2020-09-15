import javax.swing.*;

public class Abonnemang {
  public static void main(String[] arg) {
    String s = JOptionPane.showInputDialog("Antal minuter per månad?");
    int min = Integer.parseInt(s);
    if (min  <= 33)
      JOptionPane.showMessageDialog(null, "Välj Kontant");
    else if (min > 33 && min  <= 66)
      JOptionPane.showMessageDialog(null, "Välj Normal");
    else
      JOptionPane.showMessageDialog(null, "Välj Plus");
  }
}