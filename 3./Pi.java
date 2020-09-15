import javax.swing.*;

public class Pi {
    public static void main (String[] arg){
        String s;
        s = JOptionPane.showInputDialog("Radien?", '\u03C0');
        double r = Double.parseDouble(s);
        double omkr = 2 * 3.141592 * r;
        double area = 3.141592 * r * r;
        JOptionPane.showMessageDialog(null, "Omkrets: " +
        omkr + "\nArea: " + area);
    }
    
}
