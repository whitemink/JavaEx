import javax.swing.*;


public class Uni {
    public static void main (String[] arg) {
        char c1, c2, c3;
        c1 = '\u00D8';
        c2 = Character.toLowerCase(c1);
        c3 = '\u03C0';
        JOptionPane.showMessageDialog(null, "" + c1);
        JOptionPane.showMessageDialog(null, "" + c2);
        JOptionPane.showMessageDialog(null, "" + c3);
    }
    
}
