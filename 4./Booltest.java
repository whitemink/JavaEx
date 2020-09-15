import javax.swing.*;

public class Booltest {
    public static void main (String[] arg) {
        boolean b1, b2;
         JOptionPane.showMessageDialog(null, "Booleska datatypen");

        b1 = true;
         if (b1)
         JOptionPane.showMessageDialog(null, "Detta är " + b1 + " så det läses in av programmet");

        b2 = false;
         if (b2)
         JOptionPane.showMessageDialog(null, "Detta är " + b2 + "och kommer inte att läsas in");
    }
    
}
