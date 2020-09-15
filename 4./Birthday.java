import javax.swing.*;

public class Birthday {
  public static void main (String[] arg) {
    String s1 = JOptionPane.showInputDialog("Personnumer för den första personen?");
    String s2 = JOptionPane.showInputDialog("Personnumer för den andra personen?");
    // plocka ut månad och dag
    s1 = s1.substring(2,6);
    s2 = s2.substring(2,6);
    if (s1.equals(s2))
      JOptionPane.showMessageDialog(null, "Samma födelsedag");
    else
      JOptionPane.showMessageDialog(null, "Olika födelsedag");
  }
}