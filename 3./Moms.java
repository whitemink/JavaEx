import javax.swing.*;

public class Moms {
    public static void main (String[] arg) {
        String s = JOptionPane.showInputDialog("Pris (inkl. moms)?");
        double pris = Double.parseDouble(s);
        s = JOptionPane.showInputDialog("Momssats?");
        int procent = Integer.parseInt(s);
        double exkl = pris / (1 + 0.01 * procent);
        double moms = pris - exkl;
        JOptionPane.showMessageDialog(null, "Pris (exkl. moms): "
         + exkl + "\nMoms: " + moms);
    }
    
}
