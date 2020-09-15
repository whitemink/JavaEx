import javax.swing.*;

public class Kasta {
    public static void main (String[] arg) {
        int i;
        double d;
        byte b;
        i = 500;
        d = 500;
        b = (byte) 500;
        JOptionPane.showMessageDialog(null, "i=" + i + " d=" + d + " b=" + b);
        i = (int) 500.7;
        d = 500.7;
        b = (byte) 500.7;
        JOptionPane.showMessageDialog(null, "i=" + i + " d=" + d + " b=" + b);
      }
}
