import javax.swing.*;

public class Studs {
    public static void main (String[] arg) {
        while (true) {
            String s = JOptionPane.showInputDialog("Höjd?", "I meter");
            if (s == null)
            break;
            double h = Double.parseDouble(s);
            int i = 0;
            while (h > 0.01) {
                h = h * 0.7;
                i += 1;
            }
            JOptionPane.showMessageDialog(null, "Den studsar " + i + " gånger");
        }
    }
    
}
