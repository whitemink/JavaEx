import javax.swing.*;

public class Hej2 {
    public static void main (String[] arg) {
        String förnamn;    // variabel deklaration
        String efternamn;
        String hälsning;
        förnamn = JOptionPane.showInputDialog("Förnamn?");
        efternamn = JOptionPane.showInputDialog("Efternamn?");
        hälsning = "Välkommen " + förnamn + " " + efternamn;
        JOptionPane.showMessageDialog(null, hälsning);
    }
    
}
