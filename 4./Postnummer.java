import javax.swing.*;

public class Postnummer {
  public static void main(String[] arg) {
    String s = JOptionPane.showInputDialog("Postnummer?");
    String t = s.substring(0, 2);
    int nr = Integer.parseInt(t);
    if (nr>=20 && nr<=62 || nr==65 || nr==66)
      JOptionPane.showMessageDialog(null, "Götaland");
    else if (nr>=80)
      JOptionPane.showMessageDialog(null, "Norrland");
    else if (nr==12951)
      JOptionPane.showMessageDialog(null, "Fruängen 129 eyyy");
    else
      JOptionPane.showMessageDialog(null, "Svealand");
  }
}