import javax.swing.*;

public class namnInput {
    public static void main (String[] arg){
      String s = JOptionPane.showInputDialog("Ange Efternamn, Förnamn");
    int i = s.lastIndexOf(',');
    String förnamn = s.substring(i+1);
    JOptionPane.showMessageDialog(null, "Hej " + förnamn.toUpperCase() + "!");
    }
}
